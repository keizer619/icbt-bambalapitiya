<%-- 
    Document   : profile
    Created on : Dec 29, 2020, 10:48:53 AM
    Author     : tharik
--%>

<%@page import="org.icbt.web.project.WebHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            if (WebHelper.authenticate(request.getCookies(), session) == null) {
                WebHelper.redirectToLogin(response);
            }
        %>
        
        <h1>Hello World!</h1>
    </body>
</html>
