<%-- 
    Document   : index
    Created on : Dec 20, 2020, 10:09:11 AM
    Author     : tharik
--%>
<%@page import="java.util.List"%>
<%@page import="org.icbt.bambalapitiya.web.client.WebHelper"%>
<%@page import="icbt.service.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script
            src="https://code.jquery.com/jquery-3.5.1.min.js"
            integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
            crossorigin="anonymous">
        </script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <%            
            List<Student> students = WebHelper.getStudents();
            
            out.print("<ul>");
            for(Student st : students) {
                out.print("<li>" + st.getName() + "</li>");
            }
            out.print("</ul>");
            out.print("<br>");
            


            out.print("<table border='1'>");
            out.print("<tr><th>Student ID</th><th>Name</th><th>NIC</th></tr>");
            
            for(Student st : students) {
                out.print("<tr>");
                out.print("<td>" + st.getId() +"</td>");
                out.print("<td>" + st.getName()+"</td>");
                out.print("<td>" + st.getNic()+"</td>");
                out.print("</tr>");
            }
            out.print("</table>");
            
            out.print("<br>");
            
            out.print("<table id='student-tbl' class='display'>");
            out.print("<thead><tr><th>Student ID</th><th>Name</th><th>NIC</th></tr></thead>");
            
            out.print("<tbody>");
            for(Student st : students) {
                out.print("<tr>");
                out.print("<td>" + st.getId() +"</td>");
                out.print("<td>" + st.getName()+"</td>");
                out.print("<td>" + st.getNic()+"</td>");
                out.print("</tr>");
            }
            out.print("</tbody>");
            out.print("</table>");
        %>
        
        <script>
            $(document).ready( function () {
                $('#student-tbl').DataTable();
            } );
        </script>
    </body>
</html>
