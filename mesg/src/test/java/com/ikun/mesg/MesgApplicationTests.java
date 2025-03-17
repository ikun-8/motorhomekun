package com.ikun.mesg;

import com.ikun.mesg.mapper.MessageMapper;
import com.ikun.mesg.pojo.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Random;

@SpringBootTest
class MesgApplicationTests {
    @Autowired
    MessageMapper mapper;
    String[] title={"ikun","打篮球","唱跳rap","中分头","背带裤","我是ikun你记住","鸽鸽","小黑子","练习时长两年半",
            "告上法庭","油饼","乌鱼","荔枝","苏珊","梅家饺","人参公鸡","香蓓旺堡"};
    String[] content={"ikun","打篮球","唱跳rap","中分头","背带裤","我是ikun你记住","鸽鸽","小黑子","练习时长两年半",
            "告上法庭","油饼","乌鱼","荔枝","苏珊","梅家饺","人参公鸡","香蓓旺堡"};



    @Test
    void insert() {
        Random rand = new Random();
        Message m = new Message();
        for (int i = 0; i < 400; i++) {
            m.setUid(String.valueOf(rand.nextInt(1200)));
            m.setType(String.valueOf(rand.nextInt(10)));
            m.setWatch(rand.nextInt(9999));
            m.setContent(content[rand.nextInt(17)]);
            m.setTitle(title[rand.nextInt(17)]);
            int year = rand.nextInt(50) + 1985;
            int month = rand.nextInt(12) + 1;
            int day = rand.nextInt(29) + 1;
            LocalDate l = LocalDate.of(year, month, day);
            m.setTime(l);
            if (mapper.insertSelective(m) > 0)
                System.out.println("插入成功");
        }
    }

}
