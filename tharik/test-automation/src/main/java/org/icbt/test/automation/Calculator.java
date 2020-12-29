/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.test.automation;

/**
 *
 * @author tharik
 */
public class Calculator {
    public static int add(int no1, int no2) {
        
        return no1 + no2;
    }
    
    public static int subtract(int no1, int no2) {
        return no1 - no2;
    }
        
    public static int multiply(int no1, int no2) {
        return no1 * no2;
    }
           
    public static int divide(int no1, int no2) {
        return no1 / no2;
    }
    
    public static String getText() {
        String [] values = {"Hi", "Hello", "Bonjur"};    
        return values[1];
    }
    
    
    public static void process() {
        String [] values = {"Hi", "Hello", "Bonjur"};    
         String name  = values[10];
    }
    
    public static int process(int no) {
        int a = no;
        if (no == 50) {
            System.out.println("Fifty");
        }
        System.out.println(no);
        return a - 10;
    }
    
}
