package com.wyy.service;

import com.wyy.dao.UserDao;
import com.wyy.entity.Response;
import com.wyy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public String login (String name,String password){
        User user = userDao.findByNameAndPassword(name,password);
        if(user!=null){
            return "成功";
        }else {
            return "shibai";
        }
    }

    public List<User> findAllUser() {
        return userDao.findAll();
    }

    public Page<User> findPageUser(int page, int pageSize) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(page, pageSize, sort);
        return  userDao.findAll(pageable);
    }

    public String saveUser(List<User> list) {
        userDao.save(list);
        return "ok";
    }

    public List<User> findAllUserClass(){
        return userDao.findAll();
    }

    public Response<User> doLogin(String name, String password) {
        User user = userDao.findByNameAndPassword(name,password);
        Response<User> response = new Response<>();
        if (user!=null){
            response.setCode(Response.code1);
            response.setMessage("success");

        }else {
            response.setCode(Response.code0);
            response.setMessage("error");
        }
           return response;
    }
}
