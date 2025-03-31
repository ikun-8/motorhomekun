package com.ikun.mesg.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mesbody implements Serializable {
    private Integer mid;

    private String uid;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date time;

    private String content;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private static final long serialVersionUID = 1L;
}