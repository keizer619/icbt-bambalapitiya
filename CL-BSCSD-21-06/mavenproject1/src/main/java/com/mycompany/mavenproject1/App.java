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
public class App {

    public static void main(String[] args) {
        Student student = new Student("ST0001", "John", "Smith");
        System.out.println(student.getFullName());

    }
}
