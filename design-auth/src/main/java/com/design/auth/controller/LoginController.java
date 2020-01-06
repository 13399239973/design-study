package com.design.auth.controller;


import com.design.auth.entity.User;


import com.design.auth.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/findByUserName",method = RequestMethod.POST)
    public User findByUserName(@RequestParam("username") String username,@RequestParam("password") String password){

        return null;
    }
}
