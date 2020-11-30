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
        
        Person [] persons = new Person[4];

        persons[0] = new Student("ST01", "John", "Smith"); 
        persons[1] = new Student("ST02", "William", "Wallace");
        persons[2] = new Employee("1", "James", "Bond");
        persons[3] = new Employee("2", "Andrew", "Smith");
        
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getFullName());
        }
    }
}
