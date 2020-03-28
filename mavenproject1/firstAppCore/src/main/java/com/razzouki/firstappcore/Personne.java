/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.razzouki.firstappcore;

/**
 *
 * @author yassine rzk
 */
public class Personne {
        private String lastName;
        private String firstName;

    public Personne(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Personne() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" from the core app"; //To change body of generated methods, choose Tools | Templates.
    }
    
         
}
