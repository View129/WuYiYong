package com.wyy;


import com.wyy.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //xml 配置
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ctx.getBean(User.class).say("123");
        //java 类配置
        /*ApplicationContext cty = new AnnotationConfigApplicationContext(SpringConfig.class);
        (cty.getBean(User.class)).say("123");*/
    }
}
