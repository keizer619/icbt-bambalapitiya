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
public class Person {

    private String firtName;
    private String lastName;

    public Person() {
        this.firtName = "";
        this.lastName = "";
    }

    public Person(String firtName, String lastName) {
        this.firtName = firtName;
        this.lastName = lastName;
    }

    /**
     * @return the firtName
     */
    public String getFirtName() {
        return firtName;
    }

    /**
     * @param firtName the firtName to set
     */
    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.getFirtName() + " " + this.getLastName();
    }
}
