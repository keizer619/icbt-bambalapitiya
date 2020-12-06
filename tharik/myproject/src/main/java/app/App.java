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
         
         
         DBUtil utl = new OracleUtil();
         
         Process p1 = new Process();
         p1.process(utl);
         
         
     }
}
