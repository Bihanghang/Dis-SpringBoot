package com.bihang.user.controller;

import com.bihang.user.module.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By bihang
 * 2018/12/28 17:26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    public User getUser() {
        return new User(1, "bihang");
    }
}
