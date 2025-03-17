package com.ikun.user;

import com.ikun.user.mapper.RealtionMapper;
import com.ikun.user.mapper.UserMapper;
import com.ikun.user.pojo.Realtion;
import com.ikun.user.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Random;

@SpringBootTest
class UserApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RealtionMapper realtionMapper;
    String[] x={"JHJD","kokro","jciej","jijrut","wygy","okny","likr","ikun","hriun","oqdhihv","kmthd","lyoojw"};
    String[] location={
            "河北"
            ,"山西"
            ,"吉林"
            ,"辽宁"
            ,"黑龙江"
            ,"江苏"
            ,"浙江"
            ,"安徽"
            ,"福建"
            ,"江西"
            ,"山东"
            ,"河南"
            ,"湖北"
            ,"湖南"
            ,"广东"
            ,"海南"
            ,"四川"
            ,"贵州"
            ,"云南"
            ,"陕西"
            ,"甘肃"
            ,"青海"
            ,"台湾"
            ,"内蒙古"
            ,"广西"
            ,"西藏"
            ,"宁夏"
            ,"新疆"
            ,"北京"
            ,"天津"
            ,"上海"
            ,"重庆"
            ,"香港"
            ,"澳门"
    };



    @Test
    void insert() {
        Random rand = new Random();
        User u=new User();
        for (int i = 0; i < 400; i++) {
            u.setQq(String.valueOf(rand.nextInt(10000000) + 500000));
            u.setStatus(rand.nextInt(3));
            int z= rand.nextInt(3);
            if(z==1)
                u.setWx(x[rand.nextInt(12)]+ rand.nextInt(1000000));
            else if(z==2)
                u.setWx(rand.nextInt(10000000)+x[rand.nextInt(12)]);
            else
                u.setWx(x[rand.nextInt(12)]+rand.nextInt(10000)+x[rand.nextInt(12)]);
            u.setFans(rand.nextInt(30));
            u.setConcern(rand.nextInt(30));
            u.setName(String.valueOf(rand.nextInt(10000)));
            u.setPassword(String.valueOf(rand.nextInt(10000)));
            u.setAddress(location[rand.nextInt(29)]);


            if (userMapper.insertSelective(u) > 0)
                System.out.println("插入成功");
        }


    }
    @Test
    void insert2() {
        Random rand = new Random();
        Realtion r=new Realtion();
        for (int i = 0; i < 400; i++) {
            r.setSelf(String.valueOf(rand.nextInt(1200)));
            r.setFans(String.valueOf(rand.nextInt(1200)));
            if (realtionMapper.insertSelective(r) > 0)
                System.out.println("插入成功");
        }


    }

}
