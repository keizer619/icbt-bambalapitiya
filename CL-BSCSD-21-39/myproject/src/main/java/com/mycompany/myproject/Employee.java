/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myproject;

/**
 *
 * @author Niran
 */
public class Employee extends Person{
    private String epfNo;

    public Employee() {
        this.epfNo = "";
    }
    
    public Employee(String empNo, String firstName, String lastName) {
        super(firstName, lastName);
        this.epfNo = empNo;
        
    }

    public String getEmpNo() {
        return epfNo;
    }

    public void setEmpNo(String empNo) {
        this.epfNo = empNo;
    }
}
