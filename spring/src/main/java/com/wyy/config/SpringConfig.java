package com.wyy.config;

import com.wyy.Role;
import com.wyy.User;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.wyy")
@Configuration
public class SpringConfig {

    @Bean("user")
    public User myUser(){
        User user = new User();
        user.setRole(new Role());
        return  user;

    }
    @Bean("role")
    public Role myRole(){
        return new Role();
    }

}
