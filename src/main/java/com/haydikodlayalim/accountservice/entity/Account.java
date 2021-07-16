package com.haydikodlayalim.accountservice.entity;

public class Account {
    private String id;
    private String username;
    private String email;
    private String passwd;

    public Account() {

    }

    public Account(String id) {
        this.id = id;
    }

    public Account(String id, String username, String email, String passwd) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwd = passwd;
    }

    public String getId() {
        return id;
    }

    public Account setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Account setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Account setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPasswd() {
        return passwd;
    }

    public Account setPasswd(String passwd) {
        this.passwd = passwd;
        return this;
    }
}
