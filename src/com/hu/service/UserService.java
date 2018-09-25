package com.hu.service;

import com.hu.po.User;

public interface UserService {
    /**
     * 用户注册
     */
    int addUser(User user);
    /**
     * 验证登录
     */
    User getUser(User user);
}
