package com.wyy.controller;

import com.wyy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/first")
public class firstcontroller {

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
        return "/one.jsp";
    }
    @RequestMapping("/two")
    public ModelAndView us(@ModelAttribute("user") User user){
        user.setName("two");
        ModelAndView mav = new ModelAndView();
        mav.addObject("user",user);
        mav.setViewName("/one.jsp");
        return mav;
    }
}
