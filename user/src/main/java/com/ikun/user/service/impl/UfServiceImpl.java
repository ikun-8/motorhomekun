package com.ikun.user.service.impl;

//import com.ikun.user.mapper.RealtionMapper;
import com.ikun.user.mapper.CollectMapper;
import com.ikun.user.mapper.UserMapper;
import com.ikun.user.pojo.Collect;
import com.ikun.user.pojo.User;
import com.ikun.user.service.UfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UfServiceImpl implements UfService {
    @Autowired
    UserMapper userMapper;
//    @Autowired
//    RealtionMapper realtionMapper;
    @Autowired
    CollectMapper collectMapper;

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
//        return userMapper.logof(Integer.valueOf(id));
        return 1;
    }

    @Override
    public int addCollect(Collect c) {
        return collectMapper.insertSelective(c);
    }

    @Override
    public int revCollect(Collect c) {
        return collectMapper.remove(c);
    }

    @Override
    public Collect queCollect(Collect c) {
        return collectMapper.que(c);
    }

    @Override
    public List<Collect> listCollect(String uid) {
        return collectMapper.selectByPrimaryKey(Integer.valueOf(uid));
    }

    @Override
    public User quire(String id) {
        return userMapper.selectByPrimaryKey(Integer.valueOf(id));
    }
}
