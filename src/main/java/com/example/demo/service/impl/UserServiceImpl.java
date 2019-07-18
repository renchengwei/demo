package com.example.demo.service.impl;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.UserRoleMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public void authorityUser(User user) {
        userRoleMapper.deleteByUserId(user.getId());

        if(user.getRoles() != null) {
            for(Role role : user.getRoles()) {
                UserRole userRole = new UserRole(user.getId(),role.getId());
                userRoleMapper.insert(userRole);
            }
        }
    }

    @Override
    public User getUserByLoginName(String loginName) {
        User user = new User();
        user.setLoginName(loginName);
        return userMapper.selectOne(user);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void deleteUser(User user) {
        userMapper.delete(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }
}
