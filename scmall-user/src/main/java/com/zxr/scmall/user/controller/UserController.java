package com.zxr.scmall.user.controller;

import com.zxr.scmall.user.bean.UmsMember;
import com.zxr.scmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMember = userService.getAllUser();
        return umsMember;
    }


    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello word";
    }
}
