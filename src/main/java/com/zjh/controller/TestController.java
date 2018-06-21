package com.zjh.controller;

import com.zjh.dao.UserDao;
import com.zjh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiazhao on 4/3/18.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable int userId){
        return userDao.findOne(userId);
    }

    @PostMapping("/user")
    public int createUser(@RequestBody User user){
        return userDao.save(user).getUserId();
    }
}
