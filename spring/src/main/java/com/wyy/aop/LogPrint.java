package com.wyy.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logprint")
@Aspect
public class LogPrint {
    @Pointcut("execution(* com.wyy..*.say*(..))")
    private void anyMethod() {}//声明一个切入点

    @Before("anyMethod() && args(userName)")//定义前置通知
    public void doAccessCheck(String userName) {
        System.out.println("before");
        System.out.println(userName);
    }
    @After("anyMethod() && args(userName)")//定义最终通知
    public void doReleaseAction(String userName) {
        System.out.println("baibai");
    }
}
