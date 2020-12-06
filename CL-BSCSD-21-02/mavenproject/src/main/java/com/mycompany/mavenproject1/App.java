/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;


public class App 
{ 

    public App() {
    }
    
    public static void main(String[] args) {
        
        Person [] prsns = new Person[4];

        prsns[0] = new Student("ST01", "sFName1", "sLName1"); 
        prsns[1] = new Student("ST02", "sFName2", "sLName2");
        prsns[2] = new Employee("EMP01", "eFName1", "eLName1");
        prsns[3] = new Employee("EMP02", "eFName2", "eLName2");
        
        for (int i = 0; i < prsns.length; i++) {
            System.out.println(prsns[i].getFullName());
        }
    }
}
