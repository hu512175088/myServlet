package com.hu.dao;

import com.hu.po.User;

public interface UserDao {
    /**
     * 添加用户
     */
    int addUser(User user);

    /**
     * 查询单一用户
     */
    User getUser(User usr);
}
