package com.ikun.sale.mapper;

import com.ikun.sale.pojo.Sale;

import java.util.List;

public interface SaleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sale record);

    int insertSelective(Sale record);

    Sale selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);

    List<Sale> filter(Sale s);

    int remove(Integer integer);
}