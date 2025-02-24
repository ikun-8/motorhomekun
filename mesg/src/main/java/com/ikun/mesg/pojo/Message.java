package com.ikun.mesg.pojo;

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
public class Message implements Serializable {
    private String uid;

    private String uname;

    private String title;

    private String type;
    @JsonFormat(pattern = "yyyy-MM-dd-HH:mm:ss")
    private Date time;

    private String content;

    private String pic1;

    private String pic2;

    private String pic3;

    private String def1;

    private String def2;

    private String def3;

    private static final long serialVersionUID = 1L;


}