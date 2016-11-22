package com.hafedh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hafedh.domain.User;
import com.hafedh.mappers.UserMapper;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> findAllUsers() {
        final List<User> users = userMapper.findAllUsers();
        return users;
    }
}
