package com.pers.demo.module;

import org.springframework.stereotype.Component;

@Component
public class User {
    private int id;

    private String UserName;

    private String EMail;

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
