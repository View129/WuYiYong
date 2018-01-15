package com.sms.wyy;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class GetProperty {

    public static Properties getproperty(String file) throws Exception {
        Properties prop = new Properties();
        //读取属性文件a.properties
        InputStream in = new FileInputStream(file);
        prop.load(in);     ///加载属性列表
        return prop;
    }
}
