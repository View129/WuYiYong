package com.wyy.controller;

import com.wyy.entity.User;
import com.wyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class FirstController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/class")
    @ResponseBody
    public ModelAndView userClass(){
        List<User> list = new ArrayList<>();
        list = userService.findAllUserClass();
        ModelAndView mav = new ModelAndView();
        mav.addObject("list" ,list);
        mav.setViewName("userclass");
        return mav;
    }


    @RequestMapping(value="/login",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String login(String name,String password ){
        String re = userService.login(name,password);
        return re;
    }

    @RequestMapping(value="/list",produces="text/html;charset=UTF-8")
    public ModelAndView list(){
        List<User> list = new ArrayList<>();
        list = userService.findAllUser();
        ModelAndView mav = new ModelAndView();
        mav.addObject("list" ,list);
        mav.setViewName("list");
        return mav;
    }
    @RequestMapping(value="/page")
    public ModelAndView page(int page){
        Page<User> list;
        list = userService.findPageUser(page,10);
        ModelAndView mav = new ModelAndView();
        mav.addObject("list" ,list);
        mav.setViewName("page");
        return mav;
    }
    @RequestMapping(value="/save")
    @ResponseBody
    public String save(){
        List<User> list = new ArrayList<>();
        list.add(new User( 80,"eeeee99eeeee","12333666"));
        //list.add(new User( "eeeeeee3eee","1233333333"));
        String str = userService.saveUser(list);
        return str;
    }


    @RequestMapping("/say")
    @ResponseBody
    public String user(@Valid User user,BindingResult result){
        if(result.hasErrors()){
            return result.getFieldError().getDefaultMessage();
        }
        return"2";
    }
    @RequestMapping("/one" )
    public String use(@ModelAttribute("user") User user){
        user.setName("one");
        return "/one";
    }
    @RequestMapping("/two")
    public ModelAndView us(User user){
        user.setName("two");
        ModelAndView mav = new ModelAndView();
        mav.addObject("user",user);
        mav.setViewName("/one");
        return mav;
    }
}
