package com.wyy.Cglib;



import com.wyy.Proxy.Dog;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.core.MethodIntrospector;

import java.lang.reflect.Method;

public class DogMethodInterceptor implements MethodInterceptor {
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        //注意该处代理的创建过程
        Object proxyObj = enhancer.create();
        return proxyObj;// 返回代理对象
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        System.out.println("doSomething---------start");
        result = methodProxy.invokeSuper(o,objects);
        System.out.println("doSomething---------end");
        return result;
    }

    public static void main(String[] args) {
        DogMethodInterceptor dogMethodInterceptor = new DogMethodInterceptor();
        Dog dog = (Dog)dogMethodInterceptor.getInstance(new Dog());
        dog.say();

    }


}
