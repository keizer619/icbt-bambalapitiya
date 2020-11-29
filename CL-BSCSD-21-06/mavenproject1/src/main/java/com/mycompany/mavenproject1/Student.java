/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Sesath
 */
public class Student extends Person {

    String id;

    public Student() {
        this.id = "";
    }

    public Student(String id, String firtName, String lastName) {
        super(firtName, lastName);
        this.id = id;
    }

    @Override
    public String getFullName() {
        return "Student Full Name: " + super.getFullName();
    }

}
