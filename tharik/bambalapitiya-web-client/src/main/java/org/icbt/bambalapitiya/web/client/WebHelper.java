/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.bambalapitiya.web.client;

import icbt.service.MyWebService;
import icbt.service.MyWebService_Service;
import icbt.service.Student;
import icbt.service.User;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tharik
 */
public class WebHelper {
    
    
    public static List<Student> getStudents() {
        MyWebService_Service client = new MyWebService_Service();
        MyWebService proxy = client.getMyWebServicePort();
        List<Student> list = proxy.getStudents();
        return list;
    }
    
    public static User authenticate(String username, String password) {
        User authenticatedUser = null;
        
        MyWebService_Service client = new MyWebService_Service();
        MyWebService proxy = client.getMyWebServicePort();
        User user = proxy.getUser(username);
        
        //Authenticated the users password
        if (user != null && password.equals(user.getPassword())) {
            authenticatedUser= user;
        }
        
        return authenticatedUser;
    }
    
    
    public static User authenticate(Cookie[] cookies, HttpSession session) {
        // Authenticate the user from cookie session
        User user = null;

        // Iterate all the cookies from the client request
        for (Cookie cookie : cookies) {
            // Checks SESID cookie
            if (cookie.getName().equals("SESID")) {                        
                // Lookup SESID cookie value from sessions
                Object sessionObj = session.getAttribute(cookie.getValue());

                // Load the user from session object if it exists
                if (sessionObj != null) {
                     user = (User)sessionObj;
                }
            }
        }
        return user;
    }
    
    public static void redirectToLogin(HttpServletResponse response) throws IOException{
        response.sendRedirect("login.jsp");
    }
    
}
