/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author tharik
 */
public class MySQLUtil implements DBUtil {

    @Override
    public void getStudents() {
       System.out.println("Reading students from MySQL DB");
    }

    @Override
    public void addStudents() {
        System.out.println("Adding students from MySQL DB");
    }

    @Override
    public void updateStudents() {
        System.out.println("Updating students from MySQL DB");
    }

    @Override
    public void deleteStudents() {
        System.out.println("Deleting students from MySQL DB");
    }
    
}
