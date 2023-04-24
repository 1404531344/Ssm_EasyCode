package com.fz.entity;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2023-04-20 11:45:40
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = 288124597406153147L;
    
    private Integer userId;
    
    private String userName;
    
    private String realName;
    
    private String password;
    
    private String email;
    
    private String phone;
    
    private String u1;
    
    private String u2;

    public TUser() {
    }

    public TUser(Integer userId, String userName, String realName, String password, String email, String phone, String u1, String u2) {
        this.userId = userId;
        this.userName = userName;
        this.realName = realName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.u1 = u1;
        this.u2 = u2;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getU1() {
        return u1;
    }

    public void setU1(String u1) {
        this.u1 = u1;
    }

    public String getU2() {
        return u2;
    }

    public void setU2(String u2) {
        this.u2 = u2;
    }

}

