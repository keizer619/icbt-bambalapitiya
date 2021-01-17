/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt.service;

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
        Student st = new Student("01", "John Smith", "123V");
        return st;
    }
}
