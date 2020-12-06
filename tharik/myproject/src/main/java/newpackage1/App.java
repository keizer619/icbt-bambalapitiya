/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

/**
 *
 * @author tharik
 */
public class App {
    public static void main(String [] args) {
        
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        
        animal1.move();
        animal2.consume();
        
    }
}
