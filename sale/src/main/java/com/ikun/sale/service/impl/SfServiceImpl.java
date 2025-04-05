package com.ikun.sale.service.impl;

import com.ikun.sale.mapper.SaleMapper;
import com.ikun.sale.pojo.Sale;
import com.ikun.sale.service.SfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SfServiceImpl implements SfService {
    @Autowired
    SaleMapper saleMapper;
    @Override
    public List<Sale> search(Sale s) {
        return saleMapper.filter(s);
    }

    @Override
    public List<Sale> search2(String buyer) {
        return saleMapper.filter2(buyer);
    }

    @Override
    public List<Sale> search3(String seller) {
        return saleMapper.filter3(seller);
    }

    @Override
    public int delete(String id) {
        return saleMapper.remove(Integer.valueOf(id));
    }

    @Override
    public int update(Sale s) {
        return saleMapper.updateByPrimaryKeySelective(s);
    }

    @Override
    public int add(Sale s) {
        return saleMapper.insertSelective(s);
    }
}
