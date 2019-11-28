package com.fh.api.game.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Game {
    private Integer nid;
    private String c_gname;//游戏名称
    private BigDecimal f_gprice;//游戏余额
    private String c_login;//登录账号
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date d_showtime;//登录时间

    public Game() {
    }

    public Game(Integer nid, String c_gname, BigDecimal f_gprice, String c_login, Date d_showtime) {
        this.nid = nid;
        this.c_gname = c_gname;
        this.f_gprice = f_gprice;
        this.c_login = c_login;
        this.d_showtime = d_showtime;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getC_gname() {
        return c_gname;
    }

    public void setC_gname(String c_gname) {
        this.c_gname = c_gname;
    }

    public BigDecimal getF_gprice() {
        return f_gprice;
    }

    public void setF_gprice(BigDecimal f_gprice) {
        this.f_gprice = f_gprice;
    }

    public String getC_login() {
        return c_login;
    }

    public void setC_login(String c_login) {
        this.c_login = c_login;
    }

    public Date getD_showtime() {
        return d_showtime;
    }

    public void setD_showtime(Date d_showtime) {
        this.d_showtime = d_showtime;
    }
}
