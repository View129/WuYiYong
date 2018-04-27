package com.wyy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyManager {

    @SuppressWarnings("unchecked")
    public static <T> T getProxy(Object target, InvocationHandler invocationHandler){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                invocationHandler);
}

}
