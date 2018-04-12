package com.wyy.controller;

import com.wyy.entity.User;
import com.wyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/upload")
public class UploadController {
    @Autowired
    UserService userService;

    @RequestMapping("from")
    public String uploadpage(){
        return "uploadfrom";
    }

    @RequestMapping("up")
    @ResponseBody
    public String upload(HttpServletRequest request,@RequestParam("file") MultipartFile file) throws IOException {

        //如果文件不为空，写入上传路径
        if(!file.isEmpty()) {
            //上传文件路径
            String path = request.getSession().getServletContext().getRealPath("/resources/images/");
            //上传文件名
            String filename = file.getOriginalFilename();
            File filepath = new File(path,filename);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            path = path + File.separator + filename;
            file.transferTo(new File(path));
            //将文件路径写入数据库
            List<User> list = new ArrayList<>();
            list.add(new User( 80,"eeeee99eeeee",path));
            String str = userService.saveUser(list);

            return str;
        } else {
            return "error";
        }

    }
}
