package com.ikun.mesg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message implements Serializable {
    private Integer id;

    private String uid;

    private String title;

    private String type;

    private Date time;

    private String content;

    private Integer watch;

    private String pic1;

    private String pic2;

    private String pic3;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private static final long serialVersionUID = 1L;
}