package com.ikun.goods.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {
    private Integer id;

    private String uid;

    private String brand;

    private BigDecimal oldprice;

    private BigDecimal price;

    private String pic1;

    private String pic2;

    private String pic3;

    private String describe;

    private String type;

    private String gap;

    private String emission;

    private String location;

    private Integer number;

    private Date licensetime;

    private Integer usetime;

    private String chassis;

    private Integer status;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private static final long serialVersionUID = 1L;
}