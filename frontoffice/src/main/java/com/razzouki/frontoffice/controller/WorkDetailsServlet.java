/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.razzouki.frontoffice.controller;

import com.razzouki.core.entity.Catalogue;
import com.razzouki.core.entity.Work;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yassine rzk
 */
@WebServlet(name = "WorkDetailsServlet", urlPatterns = {"/work-details"})
public class WorkDetailsServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String id = request.getParameter("id");
        Work work;
        work = Catalogue.listOfWorks.stream().filter(w->w.getId()==Long.parseLong(id)).findFirst().get();
         PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Description de L4oeuvre</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br>-Titre : "+work.getTitle());
            out.println("<br>-Year : "+work.getRelease());
            out.println("<br>-Gendre : "+work.getGender());
            out.println("<br>-Artist : "+work.getMainArtist().toString());
            out.println("<br>-Resume : "+work.getSummary());

         
            
            out.println("</body>");
            out.println("</html>");
    }

   
  

}
