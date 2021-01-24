/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt.service;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author tharik
 */
@WebService(serviceName = "MyWebService")
public class MyWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !!!!!!";
    }
    
    @WebMethod(operationName = "getStudent")
    public Student getStudent(@WebParam(name = "id") String id) {
        //This should be loaded from a DB
        Student st = new Student("01", "John Smith", "123V");
        return st;
    }
    
    @WebMethod(operationName = "getStudents")
    public List<Student> getStudents() {
        //This should be loaded from a DB
        Student st = new Student("01", "John Smith", "123V");
        List<Student> students = new ArrayList<>();
        students.add(st);
        return students;
    }
    
    
    @WebMethod(operationName = "addStudent")
    public boolean addStudent(@WebParam(name = "st") Student st) {
        //This should be inserted to DB
        return true;
    }
    
    
    @WebMethod(operationName = "updateStudent")
    public boolean updateStudent(@WebParam(name = "st") Student st) {
        //This should be inserted to DB
        return true;
    }
    
    @WebMethod(operationName = "deleteStudent")
    public boolean deleteStudent(@WebParam(name = "id") String id) {
        return true;
    }
    
    @WebMethod(operationName = "getUser")
    public User getUser(@WebParam(name = "username") String username) {
        User st = DBUtil.getUser(username);
        return st;
    }
    
    @WebMethod(operationName = "getUsers")
    public List<User> getUsers() {
        List<User> users = DBUtil.getUsers();
        return users;
    }
    
    
    @WebMethod(operationName = "addUser")
    public boolean addUser(@WebParam(name = "user") User user) {
        //This should be inserted to DB
        return true;
    }
    
    
    @WebMethod(operationName = "updateUser")
    public boolean updateUser(@WebParam(name = "user") User user) {
        //This should be inserted to DB
        return true;
    }
    
    @WebMethod(operationName = "deleteUser")
    public boolean deleteUser(@WebParam(name = "username") String username) {
        return true;
    }
}
