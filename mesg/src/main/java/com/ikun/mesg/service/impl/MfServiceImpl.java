package com.ikun.mesg.service.impl;

import com.ikun.mesg.mapper.MessageMapper;
import com.ikun.mesg.pojo.Message;
import com.ikun.mesg.service.MfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MfServiceImpl implements MfService {
    @Autowired
    MessageMapper messageMapper;
    @Override
    public List<Message> search(String content) {
//        return messageMapper.selectByCnT(content);
        return null;
    }

    @Override
    public int add(Message m) {
        return messageMapper.insertSelective(m);
    }

    @Override
    public int update(Message m) {
        return messageMapper.updateByPrimaryKeySelective(m);
    }

    @Override
    public int delete(String uid) {
        return messageMapper.deleteByPrimaryKey(Integer.valueOf(uid));
    }
}
