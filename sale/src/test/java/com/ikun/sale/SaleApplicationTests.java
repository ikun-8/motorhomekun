package com.ikun.sale;

import com.ikun.sale.mapper.SaleMapper;
import com.ikun.sale.pojo.Sale;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Random;

@SpringBootTest
class SaleApplicationTests {
    @Autowired
    SaleMapper saleMapper;

    @Test
    public void insert(){
        String[] shopname={
                "中天有限公司", "宇通有限公司", "上汽大通有限公司", "长城有限公司", "江铃有限公司", "亚特有限公司", "隆翠有限公司", "华晨有限公司", "中意有限公司", "瑞弗有限公司", "莫博实业", "山东梦之旅有限公司", "览众有限公司", "傲旅有限公司", "法美瑞有限公司", "齐星有限公司", "大驰有限公司", "东风御风有限公司", "奇拓有限公司", "七狼有限公司", "时利和有限公司", "中凯有限公司", "华云途骏", "霞客乐有限公司", "锦宇有限公司", "科发有限公司", "赛沸尔有限公司", "安凯有限公司", "悦胜有限公司", "Das Delta 有限公司"
        };
        Sale s=new Sale();
        Random r=new Random();
        for (int i=0;i<400;i++){
            s.setGoodsid(String.valueOf(r.nextInt(400)+2620));
            s.setStatus(String.valueOf(1));
            s.setShopname(shopname[r.nextInt(30)]);
            int year=r.nextInt(50)+100;
            int month=r.nextInt(12)+1;
            int day= r.nextInt(30)+1;
            s.setTime(new Date(year,month,day));
            saleMapper.insertSelective(s);


        }







    }

}
