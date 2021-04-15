package com.example.giaima;

import com.example.giaima.SanPhamDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lonely
 */
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String masp = request.getParameter("masp");
        String tensp = request.getParameter("tensp");
        String nhacc = request.getParameter("nhacc");
        double giadv = Double.parseDouble(request.getParameter("giadv"));

        SanPham sp = new SanPham(masp, tensp, nhacc, giadv);
        SanPhamDAO spdao = new SanPhamDAO();
        try {
            if (spdao.UpdateProduct(masp, sp)) {
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}