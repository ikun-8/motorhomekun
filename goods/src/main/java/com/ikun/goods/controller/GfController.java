package com.ikun.goods.controller;

import com.ikun.goods.pojo.Goods;
import com.ikun.goods.pojo.ResultMsg;
import com.ikun.goods.service.GfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@RequestMapping("/goods")
@RestController
public class GfController {
    @Autowired
    GfService gfService;

    @RequestMapping("/search")
    public ResultMsg search(@RequestBody Goods g){
        System.out.println(g);

        Map<String,Object> data=new LinkedHashMap();
        List<Goods> goods=gfService.search(g);
        data.put("total",goods.size());
        data.put("goods",goods);
        return new ResultMsg(200,data,"查询成功");

    }
    @RequestMapping("/show")
    public ResultMsg show(){
        List<Goods> goods=gfService.show();
        Map<String,Object> data=new LinkedHashMap();
        data.put("total",goods.size());
        data.put("goods",goods);
        return new ResultMsg(200,data,"查询成功");

    }
    @RequestMapping("/add")
    public ResultMsg add(@RequestBody Goods g){

        if(gfService.add(g)>0)
            return new ResultMsg(200,"新增成功");
        else
            return new ResultMsg(400,"新增失败");

    }
    @RequestMapping("/update")
    public ResultMsg update(@RequestBody Goods g){


        if(gfService.update(g)>0)
            return new ResultMsg(200,"更新成功");
        else if(gfService.update(g)==-1)
            return new ResultMsg(400,"不存在该商品");
        else
            return new ResultMsg(400,"更新失败");

    }
    @RequestMapping("/delete")
    public ResultMsg delete(String id){

        if(gfService.delete(id)>0)
            return new ResultMsg(200,"删除成功");
        else
            return new ResultMsg(400,"删除失败");

    }
    @RequestMapping("/quire")
    public ResultMsg quire(String id){

        return new ResultMsg(200,gfService.quire(id),"查询成功");

    }
    @RequestMapping("/quire2/{id}")
    public Goods quire2(@PathVariable("id") String id){

        return gfService.quire(id);

    }
}
