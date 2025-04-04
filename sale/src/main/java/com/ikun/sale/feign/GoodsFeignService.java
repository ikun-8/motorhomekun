package com.ikun.sale.feign;

import com.ikun.goods.pojo.Goods;
import com.ikun.goods.pojo.ResultMsg;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@FeignClient(name = "goods-service",path = "goods")
public interface GoodsFeignService {
    @RequestMapping("/search")
    public ResultMsg search(@RequestBody Goods g);
    @RequestMapping("/show")
    public ResultMsg show();
    @RequestMapping("/add")
    public ResultMsg add(@RequestBody Goods g);
    @RequestMapping("/update")
    public ResultMsg update(@RequestBody Goods g);
    @RequestMapping("/delete")
    public ResultMsg delete(String id);
    @RequestMapping("/quire")
    public ResultMsg quire(String id);
    @RequestMapping("/quire2/{id}")
    public Goods quire2(@PathVariable("id") String id);
}
