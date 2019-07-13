package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {

    User getUser(String userName);

}
