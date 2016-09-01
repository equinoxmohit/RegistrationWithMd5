/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.dao;

import com.mohit.program.entity.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Mohit
 */
public interface RegisterDAO {

    int insert(User u) throws SQLException, ClassNotFoundException;

    List<User> getAll() throws SQLException, ClassNotFoundException;

    boolean isUsername(String username) throws SQLException, ClassNotFoundException;

    boolean isEmail(String email) throws SQLException, ClassNotFoundException;
}
