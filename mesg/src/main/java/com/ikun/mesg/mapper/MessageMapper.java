package com.ikun.mesg.mapper;

import com.ikun.mesg.pojo.Message;

import java.util.List;

public interface MessageMapper {
    int deleteByPrimaryKey(String uid);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<Message> show();
    List<Message> selectByCnT(String content);
}