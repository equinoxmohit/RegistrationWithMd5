/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.controller;

import com.mohit.program.dao.ForgotPasswordDAO;
import com.mohit.program.dao.impl.ForgotPasswordDAOImpl;
import com.mohit.program.entity.User;
import com.mohit.program.system.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohit
 */
@WebServlet(name = "forget", urlPatterns = {"/"})
public class ForgotPasswordController extends Controller {

    private ForgotPasswordDAO fDao = new ForgotPasswordDAOImpl();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/views/forget/forget.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String hascode = request.getParameter("hascode");
        try {
            User u = fDao.newPassword(hascode);
            
            
            if (u != null) {
              response.sendRedirect(request.getContextPath() +"/recover");
            }else
            {
            response.sendRedirect(request.getContextPath() + "/?wrong-hashkey");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

    }
}
