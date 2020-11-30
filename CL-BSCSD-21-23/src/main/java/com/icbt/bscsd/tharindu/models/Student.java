package com.icbt.bscsd.tharindu.models;

/**
 * @author Tharindu Eranga
 * @date Sun 29 Nov 2020
 */
public class Student extends Person {
    private String studentId;

    public Student(String firstName, String lastName, String studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    @Override
    public String toString() {
        return super.toString();
    }
}
