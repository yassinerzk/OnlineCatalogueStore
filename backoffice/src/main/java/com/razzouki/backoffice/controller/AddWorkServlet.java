/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.razzouki.backoffice.controller;

import com.razzouki.core.entity.Artist;
import com.razzouki.core.entity.Catalogue;
import com.razzouki.core.entity.Work;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yassine rzk
 */
@WebServlet(name = "AddWorkServlet", urlPatterns = {"/add-work"})
public class AddWorkServlet extends HttpServlet {

   

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
       
        
        String title = request.getParameter("title");
        int releaseDate =parseInt( request.getParameter("releaseDate"));
        String gendre = request.getParameter("gendre");
        String description = request.getParameter("desc");
        String artist = request.getParameter("art  ist");
        Artist mainArtist=new Artist(artist);
        Work work=new Work( title, gendre, releaseDate, description, mainArtist);
        String message;
       if( Catalogue.listOfWorks.add(work))
       {message="Work added to Catalogue Successfully";}
       else
       {message="Unable to add Work to Catalogue ";}
         PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Description de L4oeuvre</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>"+message+"</h3>");
            out.println("<h3><a href=\"home\">retour</a></h3>");
            out.println("</body>");
            out.println("</html>");
    
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
}
