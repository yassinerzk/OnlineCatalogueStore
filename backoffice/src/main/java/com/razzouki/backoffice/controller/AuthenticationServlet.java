/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.razzouki.backoffice.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yassine rzk
 */
@WebServlet(name = "AuthenticationServlet", urlPatterns = {"/login"})
public class AuthenticationServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        String login=request.getParameter("login");
        String password=request.getParameter("password");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
            out.println("<head>");
            out.println("<title>OnlineStore - Back-Office </title>");            
            out.println("</head>");
            out.println("<body>");
        if((login.equals("michel") && password.equals("123456"))||(login.equals("caroline") && password.equals("abcdef"))){
            out.print("<h2>Welcome "+session.getAttribute("login")+"</h2>");
            session.setAttribute("login",login);
            out.print("<a href=\"home\" >Homepage</a>");
        }else{
            out.print("<h2>login / mdp erroné</h2>");
           session.invalidate();
            out.print("<a href=\"login.html\" >Retry</a>");
        }
            out.println("</body>");
            out.println("</html>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   

}
