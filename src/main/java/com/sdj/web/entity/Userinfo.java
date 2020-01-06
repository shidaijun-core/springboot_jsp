package com.sdj.web.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 石代军
 * @since 2020-01-06
 */
public class Userinfo extends Model<Userinfo> {

    private static final long serialVersionUID=1L;

    private String userid;

    private String username;

    private String pwd;

    private String role;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
        "userid=" + userid +
        ", username=" + username +
        ", pwd=" + pwd +
        ", role=" + role +
        "}";
    }
}
