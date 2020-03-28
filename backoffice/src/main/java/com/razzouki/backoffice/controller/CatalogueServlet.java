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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yassine rzk
 */
@WebServlet(name = "CatalogueServlet", urlPatterns = {"/catalogue"})
public class CatalogueServlet extends HttpServlet {

      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(Catalogue.listOfWorks.isEmpty()){
        Artist artist1=new Artist("Chris Brown");        
        Artist artist2=new Artist("Rihanna");
        Artist artist3=new Artist("Tom Cruz");
        
        Work work1 =new Work("300");
        Work work2 =new Work("Thor");
        Work work3 =new Work("Batman");
        
        
        work1.setGender("History");
        work2.setGender("Musical");
        work3.setGender("Action");
        
        work1.setRelease(2000);
        work2.setRelease(2010);
        work3.setRelease(2020);
        
        work1.setSummary("text about movie 1");        
        work2.setSummary("text about movie 2");
        work3.setSummary("text about movie 3");
        
        work1.setMainArtist(artist1);
        work2.setMainArtist(artist2);
        work3.setMainArtist(artist3);
        
        Catalogue.listOfWorks.add(work1);
        Catalogue.listOfWorks.add(work2);
        Catalogue.listOfWorks.add(work3);
        
        }
        System.out.println("Liste des Work du catalogue");
        
      
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Liste des Work du catalogue</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Liste des Work du catalogue</h1>");
            
            for (Work work:Catalogue.listOfWorks) {
                out.println("<br><br>"+work.getTitle()+"("+work.getRelease()+")<br>");
            }
            out.println("</body>");
            out.println("</html>");
    }

}
