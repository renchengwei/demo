package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

    User getUserByLoginName(String loginName);

    void insertUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    void authorityUser(User user);
}
