package com.ikun.user.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private String qq;

    private String address;

    private String wx;

    private Integer points;

    private String headpic;

    private Integer fans;

    private Integer concern;

    private Integer status;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private static final long serialVersionUID = 1L;
}