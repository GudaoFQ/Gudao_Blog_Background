package com.gudao.blog.service.impl;

import com.gudao.blog.dao.UserDao;
import com.gudao.blog.model.User;
import com.gudao.blog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author : GuDao
 * 2021-03-08
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.selectByPrimaryKey(1L);
    }
}
