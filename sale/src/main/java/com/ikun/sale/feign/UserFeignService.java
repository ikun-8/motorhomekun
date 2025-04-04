package com.ikun.sale.feign;


import com.ikun.sale.pojo.ResultMsg;
import com.ikun.user.pojo.Collect;
import com.ikun.user.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service",path = "user")
public interface UserFeignService {
        @RequestMapping("/login")
        public ResultMsg login(@RequestBody User u);
        @RequestMapping("/register")
        public ResultMsg register(@RequestBody User u);
        @RequestMapping("/update")
        public ResultMsg update(@RequestBody User u);
        @RequestMapping("/delete")
        public ResultMsg delete(String id);
        @RequestMapping("/addCollect")
        public ResultMsg addCollect(@RequestBody Collect c);
        @RequestMapping("/revCollect")
        public ResultMsg revCollect(@RequestBody Collect c);
        @RequestMapping("/queCollect")
        public ResultMsg queCollect(@RequestBody Collect c);
        @RequestMapping("/listCollect")
        public ResultMsg listCollect(String uid);
        @RequestMapping("/quire/{id}")
        public User quire(@PathVariable("id") String id);

}
