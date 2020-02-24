<%--
  Created by IntelliJ IDEA.
  User: pdenn
  Date: 06.02.2020
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Products</title>
</head>
<body>
<div class="container">
    <h1>Products</h1>
    <table class="table">
        <thead>
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Price</td>
            <td></td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td><a href="/product/description/${product.id}" role="button" class="btn btn-primary">description</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div>
        <a href="/product/addForm" role="button" class="btn btn-warning">add</a>
    </div>
</div>
</body>
</html>
