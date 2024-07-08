package com.aloha.security5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.security5.dto.Users;
import com.aloha.security5.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int join(Users user) {
        int result = userMapper.join(user);
        return result;
    }
    
}
