package com.wyy.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class User {
    private int id;
    private String name;
    @NotNull(message = "{password.null}")
    @Length(min = 6,max = 16,message = "{password.length}")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
