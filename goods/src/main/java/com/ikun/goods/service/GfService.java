package com.ikun.goods.service;

import com.ikun.goods.pojo.Goods;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;


//@FeignClient(name="goods-service",configuration = OpenFeignConfig.class)
public interface GfService {
    public List<Goods> search(Goods g);
    public List<Goods> show();
    public int update(Goods g);
    public int delete(String id);
    public int add(Goods g);
    public Goods quire(String id);
}
