package com.ikun.user.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Realtion implements Serializable {
    private String self;

    private String fans;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private static final long serialVersionUID = 1L;


}