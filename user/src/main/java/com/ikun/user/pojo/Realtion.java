package com.ikun.user.pojo;

import java.io.Serializable;

public class Realtion implements Serializable {
    private String self;

    private String fans;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private static final long serialVersionUID = 1L;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self == null ? null : self.trim();
    }

    public String getFans() {
        return fans;
    }

    public void setFans(String fans) {
        this.fans = fans == null ? null : fans.trim();
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1 == null ? null : def1.trim();
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2 == null ? null : def2.trim();
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3 == null ? null : def3.trim();
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", self=").append(self);
        sb.append(", fans=").append(fans);
        sb.append(", def1=").append(def1);
        sb.append(", def2=").append(def2);
        sb.append(", def3=").append(def3);
        sb.append(", def4=").append(def4);
        sb.append("]");
        return sb.toString();
    }
}