/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.dao.impl;

import com.mohit.program.controller.connection.DbConnection;
import com.mohit.program.dao.ForgotPasswordDAO;
import com.mohit.program.entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohit
 */
public class ForgotPasswordDAOImpl implements ForgotPasswordDAO {

    private DbConnection conn = new DbConnection();
    private List<User> userList = new ArrayList<>();

    @Override
    public List<User> getAll() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM tbl_userinfo";
        conn.open();
        PreparedStatement stmnt = conn.initStatement(sql);
        ResultSet rs = conn.executeQuery();
        while (rs.next()) {
            User u = new User();
            u.setId(rs.getInt("user_id"));
            u.setUsername(rs.getString("username"));
            u.setEmail(rs.getString("email"));
            u.setPassword(rs.getString("password"));
            u.setConfirmPassword(rs.getString("confirm_password"));
            u.setHashKey(rs.getString("haskey"));
            userList.add(u);
        }
        conn.close();
        return userList;
    }

    @Override
    public User newPassword(String hascode) throws SQLException, ClassNotFoundException {
        for (User u : getAll()) {
            if (u.getHashKey().equals(hascode)) {
                return u;
            }
        }
        return null;
    }

}
