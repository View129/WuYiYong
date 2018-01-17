package com.sms.wyy;

/**
 * send139
 *
 */
public class SendMail {
    public static void main(String[] args) throws Exception {
        //获取远程资源并发送邮件
        EmailUtil.send(Content.getcontent()+"==>>(^.^)(^.^)晚安!");

    }
}
