package com.ikun.mesg.mapper;

import com.ikun.mesg.pojo.Mesbody;
import com.ikun.mesg.pojo.Message;

import java.util.List;

public interface MesbodyMapper {
    int insert(Mesbody record);

    int insertSelective(Mesbody record);

    List<Mesbody> selectByUid(String uid);
}