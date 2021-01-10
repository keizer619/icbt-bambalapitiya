<%-- 
    Document   : index
    Created on : Jan 10, 2021, 11:53:01 AM
    Author     : tharik
--%>

<%@page import="icbt.service.MyWebService"%>
<%@page import="icbt.service.MyWebService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
            MyWebService_Service client = new MyWebService_Service();
            MyWebService proxy = client.getMyWebServicePort();
            
            
            String txt = proxy.hello("John");
            
            out.print(txt);
            
        %>
    </body>
</html>
