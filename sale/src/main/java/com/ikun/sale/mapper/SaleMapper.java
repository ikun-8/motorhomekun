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
    List<Sale> filter2(String buyer);
    List<Sale> filter3(String seller);

    int remove(Integer id);
}