<%-- 
    Document   : index
    Created on : Jan 10, 2021, 11:53:01 AM
    Author     : tharik
--%>

<%@page import="icbt.service.Student"%>
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
            
            Student st = proxy.getStudent("01");
            out.print("<p>" + st.getName() + "</p>");
            out.print("<p>" + st.getNic() + "</p>");
            
        %>
    </body>
</html>
