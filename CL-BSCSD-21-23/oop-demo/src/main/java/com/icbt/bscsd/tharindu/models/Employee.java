package com.icbt.bscsd.tharindu.models;

/**
 * @author Tharindu Eranga
 * @date Sun 29 Nov 2020
 */
public class Employee extends Person {
    private String empCode;

    public Employee(String firstName, String lastName, String empCode) {
        super(firstName, lastName);
        this.empCode = empCode;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getFirstName(String a) {
        return super.getFirstName(a);
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }
}
