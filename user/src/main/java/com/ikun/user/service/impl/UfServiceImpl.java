package com.ikun.user.service.impl;

import com.ikun.user.mapper.RealtionMapper;
import com.ikun.user.mapper.UserMapper;
import com.ikun.user.pojo.User;
import com.ikun.user.service.UfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UfServiceImpl implements UfService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RealtionMapper realtionMapper;
    @Override
    public User login(User u) {

        return userMapper.selectByUnP(u);

    }

    @Override
    public int register(User u) {

        return userMapper.insertSelective(u);
    }

    @Override
    public int update(User u) {
        return userMapper.updateByPrimaryKeySelective(u);
    }

    @Override
    public int delete(String id) {
        return userMapper.logof(Integer.valueOf(id));
    }
}
