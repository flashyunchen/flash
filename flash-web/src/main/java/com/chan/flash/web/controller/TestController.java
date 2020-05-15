package com.chan.flash.web.controller;

import com.chan.flash.entity.SysUser;
import com.chan.flash.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private UserService userService;

    @PostMapping("insert")
    public void dd(@RequestBody SysUser sysUser){
        userService.insertUser(sysUser);
    }
    @GetMapping("helloworld")
    public void testHelloWorld( int who){
        System.out.printf(who+"-"+userService.getUser(who).toString());
    }
}
