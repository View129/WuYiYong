package com.wyy.controller;

import com.alibaba.fastjson.JSON;
import com.wyy.entity.Response;
import com.wyy.entity.User;
import com.wyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class userController {

    @Autowired
    UserService userService;
    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("dologin")
    @ResponseBody
    public String doLogin(String name, String password){
      Response<User> response = userService.doLogin(name,password);
      return JSON.toJSONString(response);
    }
}
