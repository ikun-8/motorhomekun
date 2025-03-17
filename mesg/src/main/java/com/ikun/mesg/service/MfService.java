package com.ikun.mesg.service;

import com.ikun.mesg.pojo.Message;

import java.util.List;

public interface MfService {
    public List<Message> search(String content);
    public int add(Message m);
    public int update(Message m);
    public int delete(String uid);

}
