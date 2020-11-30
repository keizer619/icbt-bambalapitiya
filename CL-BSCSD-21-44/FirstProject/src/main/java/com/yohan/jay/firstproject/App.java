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
public class App {
    
    public static void main (String [] args){
        
        Person [] persons = new Person[4];
        
        persons[0] = new Student("ST001", "John", "Doe");
        persons[1] = new Student("ST002", "Jane", "Doe");
        persons[2] = new Employee("EP001", "Mark", "Foley");
        persons[3] = new Employee("EP002", "Hannah", "Smith");
        
        for (int i = 0; i < persons.length; i++){
            System.out.println(persons[i].getFullName());
        }

    }
    
}
