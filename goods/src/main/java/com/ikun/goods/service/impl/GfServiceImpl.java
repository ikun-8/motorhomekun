package com.ikun.goods.service.impl;

import com.ikun.goods.mapper.GoodsMapper;
import com.ikun.goods.pojo.Goods;
import com.ikun.goods.service.GfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class GfServiceImpl implements GfService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> search(Goods g) {
        String[] sep=null;
        String price="0~999999999";
        if(g.getPrice()!=null){
            sep=String.valueOf(g.getPrice()).split("~");
        }
        else {
            g.setPrice(price);
            sep=price.split("~");
        }
        g.setStartPrice(sep[0]);
        g.setEndPrice(sep[1]);

        return goodsMapper.filter(g);
    }

    @Override
    public List<Goods> show() {
        return goodsMapper.show();
    }


    @Override
    public int update(Goods g) {
        if(goodsMapper.selectByPrimaryKey(g.getId())==null)
            return -1;
        return goodsMapper.updateByPrimaryKeySelective(g);
    }

    @Override
    public int delete(String id) {
        return goodsMapper.remove(Integer.valueOf(id));
    }

    @Override
    public int add(Goods g) {
        return goodsMapper.insertSelective(g);
    }
}
