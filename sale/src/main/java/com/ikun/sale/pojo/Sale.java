package com.ikun.sale.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sale implements Serializable {
    private Integer id;

    private Date time;

    private String goodsid;

    private String status;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private String shopname;

    private static final long serialVersionUID = 1L;
}