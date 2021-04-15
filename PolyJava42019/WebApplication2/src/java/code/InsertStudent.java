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
public class InsertStudent extends HttpServlet {

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
                String name = request.getParameter("txtname");
                int age = Integer.parseInt(request.getParameter("txtage"));
                String address = request.getParameter("txtaddress");

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=hocsinh;");
                PreparedStatement pst = conn.prepareStatement("insert into "
                        + "Student(name,age,address) values(?,?,?)");
                pst.setString(1, name);
                pst.setInt(2, age);
                pst.setString(3, address);
                pst.executeUpdate();
                request.setAttribute("add", "Add Student Successfully!");
                RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
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
