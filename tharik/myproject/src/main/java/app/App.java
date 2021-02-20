/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import process.Process;
import db.DBUtil;
import db.OracleUtil;

/**
 *
 * @author tharik
 */
public class App {
     public static void main(String[] args) {
         
         String [] names = new String[2];
         names[0]= "John";
         
         if (!names[1].isEmpty()) {
             System.out.print(names[1]);
         }
         
         
//         DBUtil utl = new OracleUtil();
//         
//         Process p1 = new Process();
//         p1.process(utl);
//         
         
     }
}
