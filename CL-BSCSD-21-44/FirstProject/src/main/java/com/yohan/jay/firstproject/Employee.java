/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yohan.jay.firstproject;

/**
 *
 * @author YohanJayasinghe
 */
public class Employee extends Person {
    
    private String epfNo;

    public Employee() {
        this.epfNo = "";
    }
    
    public Employee(String epfNo, String firstName, String lastName){
        super(firstName, lastName);
        this.epfNo = epfNo;
    }
    
    public String getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }

    
}
