package com.wyy.singlecase;

/**
 * 单列模式 静态内部类
 * 懒加载
 * 利用了类加载机制，因此不存在多线程并发
 */
public class Single4 {

    private Single4(){};
    public static class a{
        public static Single4 single3=new Single4();
    }
    public static Single4 getInstance(){
        return a.single3;
    }
}
