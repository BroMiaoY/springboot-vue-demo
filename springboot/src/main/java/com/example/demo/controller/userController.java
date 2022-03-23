package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.user;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600) //解决跨域问题
@RestController
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class userController {
    @Autowired
    @Resource
    UserMapper userMapper;
    @PostMapping
    public Result<?> save(@RequestBody user user) {
        if(user.getPassword() == null){
            user.setPassword("123456");
        }
        userMapper.insert(user);
        return Result.success();
    }
}
