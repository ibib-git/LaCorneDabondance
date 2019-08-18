package com.spring.henallux.laCorneDabondance.model;

import java.util.Date;
import java.util.GregorianCalendar;

public class CommandModel {

    private Integer id;
    private GregorianCalendar date;
    private UserModel userModel;

    public CommandModel () {};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
