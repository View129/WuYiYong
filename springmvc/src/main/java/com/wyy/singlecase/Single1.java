package com.wyy.singlecase;

/**
 * 单例模式 饿汉模式
 * 在类加载时创建，整个生命周期都存在，没被用到也会创建，浪费资源，线程安全
 */
public class Single1{
    private static Single1 instance = new Single1();
    private Single1(){}
    public static Single1 newInstance(){
        return instance;
    }
}
