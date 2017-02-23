package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Tong on 2017/2/22.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/index.do")
//    public ModelAndView index(){
//        return new ModelAndView("index");
//    }
    public String index(){
        return "index";
    }

    @RequestMapping("/insert.do")
    public String insert(User user){
        userService.insertUser(user);
        return "index";

    }


}
