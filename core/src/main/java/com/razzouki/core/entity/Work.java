/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.razzouki.core.entity;

import java.util.UUID;

/**
 *
 * @author yassine rzk
 */

public class Work {

  
    //private UUID id = UUID.randomUUID();

   public static int lastId;
    private long id;
    private String title;
    private String gender;
    private int release;
    private String summary;
    private Artist mainArtist;

    
    
    public Work() {
        this.id=lastId++;
     
        
    }
        public Work(String title) {
        this.id=lastId++;
        this.title = title;
        
    }
    public Work(String title, String gender, int release, String summary, Artist mainArtist) {
        this.id=lastId++;
        this.title = title;
        this.gender = gender;
        this.release = release;
        this.summary = summary;
        this.mainArtist = mainArtist;
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
     

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Artist getMainArtist() {
        return mainArtist;
    }

    public void setMainArtist(Artist mainArtist) {
        this.mainArtist = mainArtist;
    }
    
    
}
