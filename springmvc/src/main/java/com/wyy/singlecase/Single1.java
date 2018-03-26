package com.wyy.singlecase;

/**
 * 单例模式 饿汉模式
 */
public class Single1{
    private static Single1 instance = new Single1();
    private Single1(){}
    public static Single1 newInstance(){
        return instance;
    }
}
