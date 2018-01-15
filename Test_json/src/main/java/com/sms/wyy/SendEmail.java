package com.sms.wyy;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.util.Properties;

public class SendEmail {
    public static void send(String mailfrom, String password, String from, String recpto1, String recpto2, String title, String content) throws Exception{
        //注：建议使用主流邮箱，我曾遇到用sohu发出邮件丢失的情况，
        //不仅仅是在程序这里，包括在sohu邮箱客户端测试也发生了邮件丢失
        Properties prop = new Properties();
        prop.setProperty("mail.host", "smtp.qq.com");
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.auth", "true");

        //使用STARTTLS,对于其它协议（如pop3，imap），只需要将smtp改为相应协议即可（pop3要改为pop）
        // 若要使用SSL，只需要设置mail.smtp.ssl.enable为true
        prop.put("mail.smtp.starttls.enable", "true");

        //使用JavaMail发送邮件的5个步骤
        //1、创建session
        Session session = Session.getInstance(prop);
        //开启Session的debug模式，便于看到发送Email的运行状态
        session.setDebug(true);
        //2、通过session得到transport对象
        Transport ts = session.getTransport();
        //3、发件邮箱的帐号和密码。
        ts.connect(mailfrom, password);
        //4、创建邮件（Java用Message对象封装（代表）邮件），其中，最后一个参数含义：
        //（收件人<-->RecipientType.TO，抄送<-->RecipientType.CC，密送<-->RecipientType.BBC）


        //创建MIME邮件对象
        MimeMessage message = new MimeMessage(session);

        //指定发件人昵称
        String nick = MimeUtility.encodeText(from,"utf-8","B");//避免乱码

        //指明邮件的发件人
        message.setFrom(new InternetAddress(nick + "<"+mailfrom+">"));

        //指明邮件的收件人
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(recpto1));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(recpto2));

        //邮件主题
        message.setSubject(title);

        //邮件的文本内容，加入一些符号让结尾美美哒(^.^)(^.^)
        message.setContent(content + "==>>(^.^)(^.^)晚安!", "text/html;charset=UTF-8");
        // message.setContent(content.substring(0, content.length() - 1) + "==>>(^.^)(^.^)晚安!", "textml;charset=UTF-8");
        //返回创建好的邮件对象
        //5、发送邮件
        ts.sendMessage(message, message.getAllRecipients());
        ts.close();
    }
}
