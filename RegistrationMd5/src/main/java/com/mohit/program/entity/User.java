/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.entity;

import java.util.Random;

/**
 *
 * @author Mohit
 */
public class User {

    private int id;
    private String username, email, password, confirmPassword, hashkey;

    public User() {
    }

    public User(int id, String username, String email, String password, String confirmPassword, String hashkey) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.hashkey = hashkey;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getHashKey() {
        int rands=2312;
        String rand=Integer.toString(rands);
        return username + rand;
    }

    public void setHashKey(String hashkey) {
        this.hashkey = hashkey;
    }

}
