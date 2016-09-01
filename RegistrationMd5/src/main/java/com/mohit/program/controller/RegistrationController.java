/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.controller;

import com.mohit.program.dao.RegisterDAO;
import com.mohit.program.dao.impl.RegisterDaoImpl;
import com.mohit.program.entity.User;
import com.mohit.program.system.Controller;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mohit
 */
@WebServlet(name = "register", urlPatterns = {"/register"})
public class RegistrationController extends Controller {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("pass1");
        String confirmPassword = request.getParameter("pass2");
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(password.getBytes(), 0, password.length());
            String finalPassword = (new BigInteger(1, m.digest()).toString(16));
            MessageDigest m1 = MessageDigest.getInstance("MD5");
            m1.update(confirmPassword.getBytes(), 0, confirmPassword.length());
            String finalConfirm = (new BigInteger(1, m1.digest()).toString(16));

            User user = new User();
            user.setUsername(username);
            user.setEmail(email);
            user.setPassword(finalPassword);
            user.setConfirmPassword(finalConfirm);

            RegisterDAO rDao = new RegisterDaoImpl();
            rDao.insert(user);
            sendMail(user);

            response.sendRedirect(request.getContextPath()+"/success");
        } catch (NoSuchAlgorithmException | SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

    }

    private void sendMail(User u) {
        // Recipient's email ID needs to be mentioned.
        String to = u.getEmail();

        // Sender's email ID needs to be mentioned
        String from = "mohit.paudel1996@gmail.com";

        // Assuming you are sending email from localhost
        String host = "smtp.wlink.com.np";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.setProperty("mail.smtp.host", host);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        // Set response content type
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            // Set Subject: header field
            message.setSubject("Congratulations");
            // Now set the actual message
            message.setText("Congratulations " + u.getUsername() + "\tYou have succesfully registered." + "Your hash key is:" + u.getHashKey()+"\tPlease keep it save.It will be useful if you forget your password");
            // Send message
            Transport.send(message);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }
}
