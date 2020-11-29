/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author tharik
 */
public class App {
    public static void main(String[] args) {
        
        
        
        Student st = new Student("ST01", "John", "Smith");
                
        //st.setFirstName("John");
        System.out.println(st.getFullName());
    }
}
