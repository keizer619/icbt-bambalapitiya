/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project1;

/**
 *
 * @author Deneth
package com.icbt.sadeesha;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2020-11-29
 */
public class Employee extends Person {
    private String epfNo;

    public Employee() {
    }

    public Employee(String epfNo, String firstName, String lastName) {
        super(firstName, lastName);
        this.epfNo = epfNo;
    }

    public String getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public String toString() {
        return epfNo + " : " + super.getFullName();
    }
}