package com.ikun.mesg.service.impl;

import com.ikun.mesg.mapper.MesbodyMapper;
import com.ikun.mesg.mapper.MessageMapper;
import com.ikun.mesg.pojo.Mesbody;
import com.ikun.mesg.pojo.Message;
import com.ikun.mesg.service.MfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MfServiceImpl implements MfService {
    @Autowired
    MessageMapper messageMapper;
    @Autowired
    MesbodyMapper mesbodyMapper;
    @Override
    public List<Message> search(String content) {
        return messageMapper.selectByCnT(content);
    }

    @Override
    public List<Message> show(String type) {
        List<Message> mes=messageMapper.show(type);

        for(Message m:mes){
            m.setMesbodyList(mesbodyMapper.selectByMid(m.getId()));
        }
        return mes;
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

    @Override
    public List<Mesbody> searchBody(String uid) {
        return mesbodyMapper.selectByUid(uid);
    }
}
