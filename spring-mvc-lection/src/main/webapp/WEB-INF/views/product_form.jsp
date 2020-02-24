
<%--
  Created by IntelliJ IDEA.
  User: pdenn
  Date: 07.02.2020
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Form</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
    <div class="container">
        <h1>Add</h1>


        <form:form method="post" action="/product/addProduct" modelAttribute="product1">

            <div class="form-group">
                <form:input name="name" class="form-control" placeholder="Name" path="name"/>
            </div>

            <div class="form-group">
                <form:input name="price" class="form-control" placeholder="Price" path="price"/>
            </div>

            <input type="submit" class="btn btn-success" value="Submit">
        </form:form>


    </div>
</body>
</html>
