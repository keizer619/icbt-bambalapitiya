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
public class App {
     public static void main(String [] args){
       Person[] persons = new Person[4];
       
       persons[0] = new Student("s1","Jhon","Dias");
       persons[1] = new Student("s2","Sam","Frank");
       persons[2] = new Employee("e1","Tom","Sims");
       persons[3] = new Employee("e2","Jerry","Berry");
       
      for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getFullName());
      }
      
     }
}
