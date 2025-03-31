package com.ikun.user.controller;


import com.ikun.user.pojo.Collect;
import com.ikun.user.pojo.ResultMsg;
import com.ikun.user.pojo.User;
import com.ikun.user.service.UfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UfController {
    @Autowired
    UfService ufService;

    @RequestMapping("/login")
    public ResultMsg login(@RequestBody User u){
        System.out.println(u);
        User us=ufService.login(u);
        if(us!=null)
            return new ResultMsg(200,us,"登录成功");
        else
            return new ResultMsg(400,"登录失败");
    }
    @RequestMapping("/register")
    public ResultMsg register(@RequestBody User u){
        int isTrue=ufService.register(u);
        if(isTrue>0)
            return new ResultMsg(200,"注册成功");
        else
            return new ResultMsg(400,"注册失败");
    }
    @RequestMapping("/update")
    public ResultMsg update(@RequestBody User u){
        int isTrue=ufService.update(u);
        if(isTrue>0)
            return new ResultMsg(200,"修改成功");
        else
            return new ResultMsg(400,"修改失败");
    }
    @RequestMapping("/delete")
    public ResultMsg delete(String id){
        int isTrue=ufService.delete(id);
        if(isTrue>0)
            return new ResultMsg(200,"注销成功");
        else
            return new ResultMsg(400,"注销失败");
    }
    @RequestMapping("/addCollect")
    public ResultMsg addCollect(@RequestBody Collect c){
        int isTrue=ufService.addCollect(c);
        if(isTrue>0)
            return new ResultMsg(200,"收藏成功");
        else
            return new ResultMsg(400,"收藏失败");
    }
    @RequestMapping("/revCollect")
    public ResultMsg revCollect(@RequestBody Collect c){
        int isTrue=ufService.revCollect(c);
        if(isTrue>0)
            return new ResultMsg(200,"取消成功");
        else
            return new ResultMsg(400,"取消失败");
    }
    @RequestMapping("/queCollect")
    public ResultMsg queCollect(@RequestBody Collect c){
        Collect isTrue=ufService.queCollect(c);
        if(isTrue!=null)
            return new ResultMsg(200,"查询成功");
        else
            return new ResultMsg(400,"查询失败");
    }
}
