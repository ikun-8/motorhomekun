package com.ikun.mesg.service;

import com.ikun.mesg.pojo.Mesbody;
import com.ikun.mesg.pojo.Message;

import java.util.List;

public interface MfService {
    public List<Message> search(String content);
    public List<Message> show(String type);
    public int add(Message m);
    public int update(Message m);
    public int delete(String uid);

    List<Mesbody> searchBody(String uid);
}
