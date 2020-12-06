/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import db.DBUtil;

/**
 *
 * @author tharik
 */
public class Process {
    public void process(DBUtil util) {
     
        util.addStudents();
        
        
        util.addStudents();
        
        util.updateStudents();
        
        util.deleteStudents();
        
    }
}
