<%-- 
    Document   : index
    Created on : Oct 5, 2019, 10:14:32 AM
    Author     : MINH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Danh bạ điện thoai</h1>
        <form action="SearchAccount">
            Nhaap ten thue bao:<input type="text"name="txtThuebao"value=""><br>
            Nhap so dien thoai:<input type="text"name="txtSoDT"value=""><br>
            Dia chi:<input type="text"name="txtDiaChi"value=""><br>
            <input type="submit"name="Submit"value="Tra cuu">
        </form>
    </body>
</html>
