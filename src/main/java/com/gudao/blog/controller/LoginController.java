package com.gudao.blog.controller;

import com.gudao.blog.model.User;
import com.gudao.blog.service.LoginService;
import com.gudao.blog.utils.result.ResultResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : GuDao
 * 2021-03-06
 */
@RestController
@RequestMapping("/api/v1/pri/user")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public ResultResponse login(@RequestBody User user){
        logger.info("info");
        User loginUser = loginService.login(user);
        ResultResponse<?> success = ResultResponse.success();
        return success;
    }
}
