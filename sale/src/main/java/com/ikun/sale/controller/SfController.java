package com.ikun.sale.controller;


import com.ikun.sale.pojo.ResultMsg;
import com.ikun.sale.pojo.Sale;
import com.ikun.sale.service.SfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SfController {
    @Autowired
    SfService sfService;

    @RequestMapping("/search")
    public ResultMsg search(@RequestBody Sale s){
        List<Sale> data=sfService.search(s);
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
        if(sfService.add(s)>0)
            return new ResultMsg(200,"新增成功");
        else
            return new ResultMsg(400,"新增失败");
    }

}
