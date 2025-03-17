package com.ikun.mesg.controller;

import com.ikun.mesg.pojo.Message;
import com.ikun.mesg.pojo.ResultMsg;
import com.ikun.mesg.service.MfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MfController {
    @Autowired
    MfService mfService;
    @RequestMapping("/search")
    public ResultMsg search(String content){
        List<Message> data=mfService.search(content);
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

}
