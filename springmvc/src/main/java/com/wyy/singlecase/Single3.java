package com.wyy.singlecase;

/**
 * 单列模式 静态内部类
 */
public class Single3 {

    private Single3(){};
    public static class a{
        public static Single3 single3=new Single3();
    }
    public static Single3 getInstance(){
        return a.single3;
    }
}
