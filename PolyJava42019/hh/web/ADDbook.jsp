
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        ${add}
        <h1>Add BOOK</h1>
        <form action="./ADDbook.jsp" method="POST">
            <table>
                <tr>
                    <td>ID sách</td>
                    <td><input type="text" name="txtID" value="" /></td>
                </tr>
                <tr>
                    <td>Tên Sách</td>
                    <td><input type="text" name="txtname" value="" /></td>
                </tr>
                <tr>
                    <td>Số lượng</td>
                    <td><input type="text" name="txtgia" value="" /></td>
                </tr>
                <tr>
                    <td>Giá</td>
                    <td><input type="text" name="txtgia" value="" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Add" /></td>
                    <td><input type="button" value="Canne" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>