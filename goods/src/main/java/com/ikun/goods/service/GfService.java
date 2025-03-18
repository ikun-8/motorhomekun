package com.ikun.goods.service;

import com.ikun.goods.pojo.Goods;

import java.util.List;

public interface GfService {
    public List<Goods> search(Goods g);
    public List<Goods> show();
    public int update(Goods g);
    public int delete(String id);
    public int add(Goods g);
}
