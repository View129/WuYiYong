package com.wyy.singlecase;

/**
 * 单例模式 枚举
 * 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 */
    public enum Single5 {
        INSTANCE;
    private Resource instance;
    Single5() {
        instance = new Resource();
    }
    public Resource getInstance() {
        return instance;
    }
    }

    class Resource {

    }



