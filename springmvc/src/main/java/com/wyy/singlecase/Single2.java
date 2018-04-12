package com.wyy.singlecase;

/**
 * 单例模式 懒汉
 * 实现延迟加载，但是调用频繁会性能不够优秀，线程安全
 */
public class Single2 {
    private static Single2 instance = null;
    private Single2(){}
    public static synchronized Single2 newInstance(){
        if(null == instance){
            instance = new Single2();
        }
        return instance;
    }
}
