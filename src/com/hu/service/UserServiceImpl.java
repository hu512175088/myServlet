package com.hu.service;

import com.hu.dao.UserDao;
import com.hu.dao.UserDaoImpl;
import com.hu.po.User;

public class UserServiceImpl implements UserService {
    private UserDao uDao = new UserDaoImpl();

    @Override
    public int addUser(User user) {
        return uDao.addUser(user);
    }
    @Override
    public User getUser(User user) {
        return uDao.getUser(user);
    }
}
