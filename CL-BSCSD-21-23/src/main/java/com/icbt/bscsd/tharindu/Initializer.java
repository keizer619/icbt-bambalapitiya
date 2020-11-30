package com.icbt.bscsd.tharindu;

import com.icbt.bscsd.tharindu.models.Employee;
import com.icbt.bscsd.tharindu.models.Student;

/**
 * @author Tharindu Eranga
 * @date Sun 29 Nov 2020
 */
public class Initializer {
    public static void main(String[] args) {
        Student st = new Student("S01", "Tharindu", "Eranga");
        System.out.println(st.getFullName());

        Employee emp = new Employee("E01", "Tharindu", "Eranga");
        System.out.println(emp.getFullName());
    }
}
