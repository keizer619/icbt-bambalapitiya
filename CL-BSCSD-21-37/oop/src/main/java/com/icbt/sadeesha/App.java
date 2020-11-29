package com.icbt.sadeesha;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2020-11-29
 */
public class App {

    public static void main(String[] args) {
        Student student = new Student("ST01", "Sadeesha", "Eranga");
        System.out.println("student = " + student);

        Employee employee = new Employee("EMP01", "Sadeesha", "Eranga");
        System.out.println("employee = " + employee);
    }
}
