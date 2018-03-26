package com.servelet;

import session.listener.CounterListener;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServelet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        //ServletContext context = req.getServletContext();
        req.getSession();
        int count =  CounterListener.count;
        String str = "asofhjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjyyjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjdvnuisdavnasuiasuiasuiasuiasuiasuiasuiasuiasuiasuiasuiasuiasuiasuiasui";
        resp.getWriter().write(str+req.getParameter("name")+req.getAttribute("key")+"当前在线人数"+count);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String imageCode = req.getParameter("imageCode");
        if(imageCode.equalsIgnoreCase((String) req.getSession().getAttribute("imageCode"))){

            if(name.equals("wuyiyong")&&password.equals("123")){
                resp.getWriter().write("登陆成功");
            }else{
                resp.getWriter().write("登陆失败");
            }
        }else {
            resp.getWriter().write("验证码错误");
        }
    }
}
