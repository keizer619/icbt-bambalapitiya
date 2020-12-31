/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author HP
 */
public class person {
    private String firstName="";
    private String lastName="";
    
    public person(String firstName,String lastName){                        //ovderriding contructor
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    public void setFirstname(String firstName){
        this.firstName=firstName;
    }
    
    
    public String getFirstaname(){
        return this.firstName;
    }
    
    public void setLastname(String lastName){
        this.lastName=lastName;
    }
    
    
    public String getLastaname(){
        return this.lastName;
    }
    
    
    public String getFullname(){
        return this.firstName + "  " + lastName;
    }
}
