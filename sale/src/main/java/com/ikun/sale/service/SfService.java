package com.ikun.sale.service;

import com.ikun.sale.pojo.Sale;

import java.util.List;

public interface SfService {
    public List<Sale> search(Sale s);
    public List<Sale> search2(String buyer);
    public List<Sale> search3(String seller);
    public int delete(String id);
    public int update(Sale s);
    public int add(Sale s);
}
