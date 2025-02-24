package com.ikun.sale.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sale implements Serializable {
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd-HH:mm:ss")
    private Date time;

    private String goodsid;

    private String status;

    private String def1;

    private String def2;

    private String def3;

    private String shopname;

    private static final long serialVersionUID = 1L;


}