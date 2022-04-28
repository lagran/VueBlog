package com.funboy.controller;


import com.funboy.common.lang.Result;
import com.funboy.entity.User;
import com.funboy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author funboy
 * @since 2022-04-28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public Result index() {
        User user = userService.getById(1L);
        return Result.succ(user);
    }
}
