<%--
  Created by IntelliJ IDEA.
  User: thari
  Date: 12/29/2020
  Time: 8:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha256-4+XzXVhsDmqanXGHaHvgh1gMQKX40OUvDEBTu8JcmNs="
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
          crossorigin="anonymous">

    <link rel="stylesheet" type="text/css"
          href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">
    <script type="text/javascript" charset="utf8"
            src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>
</head>
<body>
    <div class="container">
        <div class="jumbotron d-flex justify-content-center">
            <h1 >Customers</h1>
        </div>
        <table id="customerTable" class="hover row-border stripe">
            <caption>Customers result</caption>
            <thead>
                <tr>
                    <th id="idHead">ID</th>
                    <th id="nameHead">Name</th>
                    <th id="telHead">Mobile</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${customers}" var="customer">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.name}</td>
                    <td>${customer.tel}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <script>
        $(document).ready( function () {
            $('#customerTable').DataTable();
        } );
    </script>
</body>
</html>
