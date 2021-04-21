package com.itDen.blog.models;

import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    private String login;
    private int password;
    private String id;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}
