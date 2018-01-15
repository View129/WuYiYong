package com.sms.wyy;

import java.util.Properties;

/**
 * Hello world!
 *
 */
public class Send139 {
    public static void main(String[] args) throws Exception {

        //读取邮件配置文件
        Properties prop=GetProperty.getproperty("mail.properties");
        //发送邮件
        SendEmail.send(prop.getProperty("mailfrom"), prop.getProperty("password"), prop.getProperty("from"), prop.getProperty("recpto1"), prop.getProperty("recpto2"), prop.getProperty("title"), GetContent.getcontent());



    }


}
