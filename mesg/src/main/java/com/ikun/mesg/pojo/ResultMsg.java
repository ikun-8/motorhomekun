package com.ikun.mesg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultMsg {
    private int code;
    private Object data;
    private String msg;
    public ResultMsg(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
