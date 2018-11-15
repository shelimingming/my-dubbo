package com.sheliming.controller;

import com.sheliming.domain.User;
import com.sheliming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("hello/{id}")
    User getUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }
}
