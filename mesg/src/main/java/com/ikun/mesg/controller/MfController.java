package com.ikun.mesg.controller;

import com.ikun.mesg.pojo.Mesbody;
import com.ikun.mesg.pojo.Message;
import com.ikun.mesg.pojo.ResultMsg;
import com.ikun.mesg.service.MfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/mes")
@RestController
public class MfController {
    @Autowired
    MfService mfService;
    @RequestMapping("/search")
    public ResultMsg search(String content){
//        System.out.println(content);
        Map<String,Object> data=new LinkedHashMap();
        List<Message> mes=mfService.search(content);
        data.put("total",mes.size());
        data.put("mes",mes);
        return new ResultMsg(200,data,"查询成功");
    }
    @RequestMapping("/show")
    public ResultMsg show(String type){
//        System.out.println(type);
        Map<String,Object> data=new LinkedHashMap();
        List<Message> mes=mfService.show(type);
        data.put("total",mes.size());
        data.put("mes",mes);
//        System.out.println(mes);
        return new ResultMsg(200,data,"查询成功");
    }
    @RequestMapping("/update")
    public ResultMsg update(@RequestBody Message m){
        if(mfService.update(m)>0)
            return new ResultMsg(200,"更新成功");
        else
            return new ResultMsg(400,"更新失败");

    }
    @RequestMapping("/delete")
    public ResultMsg delete(String uid){
        if(mfService.delete(uid)>0)
            return new ResultMsg(200,"删除成功");
        else
            return new ResultMsg(400,"删除失败");
    }
    @RequestMapping("/add")
    public ResultMsg add(@RequestBody Message m){
        if(mfService.add(m)>0)
            return new ResultMsg(200,"新增成功");
        else
            return new ResultMsg(400,"新增失败");
    }
    @RequestMapping("/searchBody")
    public ResultMsg searchBody(String uid){
        Map<String,Object> data=new LinkedHashMap();
        List<Mesbody> mes=mfService.searchBody(uid);
        data.put("total",mes.size());
        data.put("mesBody",mes);
        return new ResultMsg(200,data,"查询成功");
    }
    @RequestMapping("/addBody")
    public ResultMsg addBody(@RequestBody Mesbody m){
        int i=mfService.addBody(m);
        if(i>0)
            return new ResultMsg(200,"新增成功");
        else
            return new ResultMsg(200,"新增失败");
    }
    @RequestMapping("/queBody")
    public ResultMsg queBody(String mid){
        Map<String,Object> data=new LinkedHashMap();
        List<Mesbody> mes=mfService.queBody(mid);
        data.put("total",mes.size());
        data.put("mesBody",mes);
        return new ResultMsg(200,data,"查询成功");
    }

}
