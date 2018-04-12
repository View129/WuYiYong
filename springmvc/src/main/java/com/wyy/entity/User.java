package com.wyy.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull(message = "{password.null}")
    private String name;
    @NotNull(message = "{password.null}")
    @Length(min = 6,max = 200,message = "{password.length}")
    private String password;

    @ManyToOne
    @JoinColumn(name="classid",referencedColumnName ="id" )
    private Class clazz;



    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public User() {}

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public User(int id,String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

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
