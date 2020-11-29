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
public class Student extends person {

    private String studentId="";
    public Student(String ID,String firstName, String lastName) {
        super(firstName, lastName);
        
        this.studentId=ID;
    }
    
    public String getStudentID(){
        return this.studentId;
    }
    
    @Override
    
    public String getFullname(){
        return "----" + super.getFullname();
    }
    
}
