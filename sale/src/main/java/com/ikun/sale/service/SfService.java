package com.ikun.sale.service;

import com.ikun.sale.pojo.Sale;

import java.util.List;

public interface SfService {
    public List<Sale> search(Sale s);
    public int delete(String id);
    public int update(Sale s);
    public int add(Sale s);
}
