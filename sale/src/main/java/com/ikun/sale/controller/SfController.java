package com.ikun.sale.controller;


import com.ikun.goods.pojo.Goods;
import com.ikun.sale.feign.GoodsFeignService;
import com.ikun.sale.feign.UserFeignService;
import com.ikun.sale.pojo.ResultMsg;
import com.ikun.sale.pojo.Sale;
import com.ikun.sale.service.SfService;
import com.ikun.user.pojo.User;
import org.bouncycastle.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/sale")
@RestController
public class SfController {
    @Autowired
    SfService sfService;
    @Autowired
    UserFeignService userFeignService;
    @Autowired
    GoodsFeignService goodsFeignService;

    @RequestMapping("/search")
    public ResultMsg search(@RequestBody Sale s){
        Map<String,Object> data=new LinkedHashMap();
        List<Sale> sales=sfService.search(s);
        data.put("total",sales.size());
        data.put("sales",sales);
        return new ResultMsg(200,data,"查询成功");

    }
    @RequestMapping("/searchByb")
    public ResultMsg searchByb(String buyer){
        Map<String,Object> data=new LinkedHashMap();
        List<Sale> sales=sfService.search2(buyer);
        data.put("total",sales.size());
        data.put("sales",sales);
        return new ResultMsg(200,data,"查询成功");

    }
    @RequestMapping("/searchBys")
    public ResultMsg searchBys(String seller){
        Map<String,Object> data=new LinkedHashMap();
        List<Sale> sales=sfService.search3(seller);
        data.put("total",sales.size());
        data.put("sales",sales);
        return new ResultMsg(200,data,"查询成功");

    }
    @RequestMapping("/update")
    public ResultMsg update(@RequestBody Sale s){
        if(sfService.update(s)>0)
            return new ResultMsg(200,"更新成功");
        else
            return new ResultMsg(400,"更新失败");
    }
    @RequestMapping("/delete")
    public ResultMsg delete(String id){
        if(sfService.delete(id)>0)
            return new ResultMsg(200,"删除成功");
        else
            return new ResultMsg(400,"删除失败");
    }
    @RequestMapping("/add")
    public ResultMsg add(@RequestBody Sale s){
        try {
//            goodsFeignService.show();
            User u=userFeignService.quire(s.getBuyer());
            String price=goodsFeignService.quire2(s.getGoodsid()).getPrice();
            u.setPoints(u.getPoints()+Integer.parseInt(price.substring(0,price.length()-5)));
            userFeignService.update(u);
            sfService.add(s);
            return new ResultMsg(200,"新增成功");
        } catch (Exception e) {
            return new ResultMsg(400,"新增失败");
        }
    }

}