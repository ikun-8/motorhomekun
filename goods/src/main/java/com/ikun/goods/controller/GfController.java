package com.ikun.goods.controller;

import com.ikun.goods.pojo.Goods;
import com.ikun.goods.pojo.ResultMsg;
import com.ikun.goods.service.GfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GfController {
    @Autowired
    GfService gfService;

    @RequestMapping("/search")
    public ResultMsg search(@RequestBody Goods g){

        List<Goods> data=gfService.search(g);
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
}
