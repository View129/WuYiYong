package com.wyy.Proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        TestInvocationHandler testInvocationHandler = new TestInvocationHandler(dog);
        Pet pet = ProxyManager.getProxy(dog,testInvocationHandler);
        pet.say();
    }
}
