package com.wyy.singlecase;

/**
 * 单例模式 懒汉 双重校验锁
 * 线程安全，并发的性能优秀，懒加载
 */
public class Single3 {
    private volatile static Single3 single=null;
    private Single3(){};
    public  static Single3 getInstance(){
        if (single==null){
            synchronized (Single3.class){
                if (single==null){
                    single=new Single3();
                }
            }
        }
        return single;
    }
}
