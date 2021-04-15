<%-- 
    Document   : editUser
    Created on : Oct 3, 2019, 11:15:18 AM
    Author     : MINH
--%>

<%@page import="edu.poly.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%User user = (User) request.getAttribute("user");
        %>
        <h1>Edit user!</h1>
        <form action="EditUserController"method="post">
            Username:
            <input type="text" name="username" value="<%=user.getUsername()%>"><br>
            Name:
            <input type="text" name="namee" value="<%=user.getName()%>"><br>
            Password:
            <input type="text" name="password" value="<%=user.getPassword()%>"><br>
            Gender:
            Male
            <input type="radio" name="gender" value="<%=user.isGender()%>"
                   <%= user.isGender() ? "selected" : ""%>>
            Female
            <input type="radio" name="gender" value="<%=!user.isGender()%>"><br>
            <%=!user.isGender()?"selected" : ""%>><br>
            <input type="submit"value="Update">

        </form>
    </body>
</html>
