/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.myproject;

/**
 *
 * @author tharik
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        
        Student st = new Student();
        System.out.println(st.firstName);
        System.out.println(st.lastName);
        
        st.firstName = "aaa";
        
        Student st2 = new Student();
        System.out.println(st2.firstName);
        System.out.println(st2.lastName);
    }
}
