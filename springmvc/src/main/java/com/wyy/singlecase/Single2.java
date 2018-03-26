package com.wyy.singlecase;

/**
 * 单例模式 懒汉 双重校验锁
 */
public class Single2 {
    private volatile static Single2 single=null;
    private Single2(){};
    public  static Single2 getInstance(){
        if (single==null){
            synchronized (Single2.class){
                if (single==null){
                    single=new Single2();
                }
            }
        }
        return single;
    }
}
