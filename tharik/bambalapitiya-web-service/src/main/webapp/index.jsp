<%-- 
    Document   : index.jsp
    Created on : Jan 24, 2021, 10:13:28 AM
    Author     : tharik
--%>

<%@page import="icbt.service.DBUtil"%>
<%@page import="java.util.List"%>
<%@page import="icbt.service.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
        List<User> users = DBUtil.getUsers();    
        
        out.println(users.get(0).getFirstName());
        
        %>
    </body>
</html>
