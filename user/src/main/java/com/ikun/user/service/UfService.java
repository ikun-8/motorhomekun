package com.ikun.user.service;

import com.ikun.user.pojo.User;

public interface UfService {
    public User login(User u);
    public int register(User u);

    int update(User u);

    int delete(String id);
}
