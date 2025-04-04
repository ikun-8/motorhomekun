package com.ikun.user.service;

import com.ikun.user.pojo.Collect;
import com.ikun.user.pojo.User;

import java.util.List;

public interface UfService {
    public User login(User u);
    public int register(User u);

    int update(User u);

    int delete(String id);

    int addCollect(Collect c);

    int revCollect(Collect c);

    Collect queCollect(Collect c);

    List<Collect> listCollect(String uid);

    User quire(String id);
}
