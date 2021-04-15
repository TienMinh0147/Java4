<%-- 
    Document   : list
    Created on : Oct 23, 2019, 1:33:42 AM
    Author     : MINH
--%>

<%@page import="java.util.List"%>
<%@page import="edu.poly.models.Customers"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> List All Customers</h1>
        <hr>
        <table>
            <tr>
                <td>Customer ID</td>
                <td>Name</td>
                <td>Email</td>
                <td>Tel</td>
                <td>&nbsp;</td>

            </tr>
            <%
                List<Customers> customers = (List<Customers>) request.getAttribute("customers");
                if (customers != null) {
                    for (Customers item : customers) {


            %>
            <tr>
                <td> <%=item.getCustomerId()%> </td>
                <td> <%=item.getName()%> </td>
                <td> <%=item.getEmail()%> </td>
                <td> <%=item.getTel()%> </td>
                <td>
                    <a href="EditCustomerController?id <%=item.getCustomerId()%>"> Edit</a>!
                    <a href="DeleteCustomerController?id<%=item.getCustomerId()%>" >Delete</a>
                </td>

            </tr>
            <%}
                }%>
        </table>
    </body>
</html>
