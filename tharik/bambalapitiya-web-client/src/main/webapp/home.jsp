<%-- 
    Document   : home
    Created on : Dec 29, 2020, 9:11:38 AM
    Author     : tharik
--%>

<%@page import="org.icbt.bambalapitiya.web.client.WebHelper"%>
<%@page import="icbt.service.User"%>
<%@page import="java.util.UUID"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            User user = WebHelper.authenticate(request.getCookies(), session);
            
            if (user == null) {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
            
            
                if (username != null && password != null) {
                    
                    user = WebHelper.authenticate(username, password);
                    if (user != null) {
                        String sessionId = UUID.randomUUID().toString().replace("-", "").toUpperCase();

                        // Create cookie and attach it to response
                        Cookie cookie = new Cookie("SESID", sessionId);
                        response.addCookie(cookie);

                        // Create session attribute
                        session.setAttribute(sessionId, user);


                        out.print("Welcome " + user.getFirstName() + " " + user.getLastName());
                    } else {
                        WebHelper.redirectToLogin(response);
                    }
                } else {
                    WebHelper.redirectToLogin(response);
                }
            } else {
                out.print("Welcome " + user.getFirstName() + " " + user.getLastName());
            }          
        %>
    </body>
</html>
