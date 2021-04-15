/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
public class Insertbook extends HttpServlet {

    /**
     * Processes requests for both HTTP &lt;code&gt;GET&lt;/code&gt; and
     * &lt;code&gt;POST&lt;/code&gt; methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            try {
                // Lay gia tri tu nguoi dung nhap vao
                String name = request.getParameter("txtName");
                int age = Integer.parseInt(request.getParameter("txtAge"));
                String address = request.getParameter("txtAddress");
                int sl = Integer.parseInt(request.getParameter("txtsoluong"));
                int gia = Integer.parseInt(request.getParameter("txtgia"));
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhos:1433; "
                        + "databaseName=book;", "sa", "123456");
                PreparedStatement pst = conn.prepareStatement("insert into "
                        + "book(book_id,tensach,age,giaban) values(?,?,?,?)");
                pst.setString(2, name);
                pst.setInt(1, age);
                pst.setInt(3, sl);
                pst.setInt(4, gia);

                pst.executeUpdate();
                request.setAttribute("add", "Add Student Successfully!");
                RequestDispatcher dis = request.getRequestDispatcher("ADDbook.jsp");
                dis.forward(request, response);
            } catch (Exception e) {
            }

        } finally {
            out.close();
        }
    }

    // &lt;editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code."&gt;
    /**
     * Handles the HTTP &lt;code&gt;GET&lt;/code&gt; method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP &lt;code&gt;POST&lt;/code&gt; method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// &lt;/editor-fold&gt;

}
