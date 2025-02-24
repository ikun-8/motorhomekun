package com.ikun.goods;

import com.ikun.goods.mapper.GoodsMapper;
import com.ikun.goods.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

@SpringBootTest
class GoodsApplicationTests {

    @Autowired
    GoodsMapper goodsMapper;
    String[] name={
            "宇通房车"
            ,"江铃旅居车"
            ,"瑞弗REV"
            ,"新吉奥"
            ,"中天房车"
            ,"上汽大通房车"
            ,"长城房车"
            ,"亚特房车"
            ,"隆翠房车"
            ,"华晨房车"
            ,"中意房车"
            ,"康派斯"
            ,"览众"
            ,"齐星房车"
            ,"大通MAXUS"
            ,"海格Hager"
            ,"东风御风DFAC"
            ,"中欧房车ZOEMO"
            ,"福特"
            ,"依维柯IVECO"
            ,"福建奔驰"
            ,"驿舟"
            ,"优特尔"
            ,"勇合"
            ,"威士捷"
            ,"正利信"
            ,"天天耍"
    };
    String[] chassis={
            "福特 Transit"
            ,"依维柯 Daily"
            ,"奔驰 Sprinter"
            ,"大众 Transporter"
            ,"丰田 HiAce"
            ,"马自达 Bongo"
            ,"日产 NV200"
            ,"雪佛兰 Express"
            ," GMC Savana"
            ,"福特 E-Series"
            ,"道奇 Ram ProMaster"
            ,"雷诺 Trafic"
            ,"标致 Boxer"
            ,"菲亚特 Ducato"
            ,"大众 Crafter"
            ,"福特 Tourneo"
            ,"丰田 Alphard"
            ,"本田 Step Wagon"
            ,"三菱 Delica"
            ,"起亚 Carnival"
            ,"现代 H1"
            ,"斯巴鲁 Exiga"
            ,"五十铃 Elf"
            ,"日野 Dutro"
            ,"福特 Ranger"
            ,"丰田 Hilux"
            ,"雪佛兰 Colorado"
            ," GMC Canyon"
            ,"日产 Frontier"
            ,"铃木 Carry"
            ,"马自达 BT-50"
            ,"大众 Amarok"
            ,"福特 F-Series"
            ,"悍马 H2"
            ,"路虎 Defender"
            ,"吉普 Wrangler"
            ,"丰田 Land Cruiser"
            ,"三菱 Pajero"
            ,"日产 Patrol"
            ,"路虎 Discovery"
            ,"悍马 H1"
            ,"悍马 H3"
            ,"路虎 Range Rover"
            ,"路虎 Range Rover Sport"
            ,"路虎 Range Rover Evoque"
            ,"路虎 Range Rover Velar"
    };
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
    public void insert() throws Exception {
        Random rand = new Random();
        for(int i=0;i<400;i++){
            Goods g=new Goods();
            g.setBrand(name[rand.nextInt(27)]);
            g.setPrice(String.valueOf((rand.nextInt(1000000)+500000)));
            g.setChassis(chassis[rand.nextInt(46)]);
            g.setLocation(location[rand.nextInt(29)]);
            g.setEmission(String.valueOf(rand.nextInt(10)));
            g.setNumber(rand.nextInt(5));
            g.setGap(String.valueOf(rand.nextInt(999)));
            int year=rand.nextInt(50)+1985;
            int month=rand.nextInt(12)+1;
            int day= rand.nextInt(30)+1;
            LocalDate l=LocalDate.of(year,month,day);
            g.setLicensetime(l);
            g.setUsetime(rand.nextInt(8));
            if(goodsMapper.insertSelective(g)>0)
                System.out.println("插入成功");



        }



    }


}
