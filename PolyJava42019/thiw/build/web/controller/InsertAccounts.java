/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Baithi;

/**
 *
 * @author Thái Tấn Thái
 */
@WebServlet(name = "InsertAccounts", urlPatterns = {"/InsertAccounts"})
public class InsertAccounts extends HttpServlet {

    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       request.setAttribute("mode", "insert");
        RequestDispatcher rd = request.getRequestDispatcher("AddOrEdit.jsp");
        rd.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String pin = request.getParameter("pin");
        String balance = request.getParameter("balance");
        String expiryDate = request.getParameter("expiryString");
        String description = request.getParameter("description");
        try {
            Baithi model = new Baithi();
            AccountDao dao = new AccountDao();
            
            model.setPin(pin);
            model.setBalance(Double.parseDouble(balance));
            model.setExpiryString(expiryDate);
            model.setDescription(description);
            
            dao.InsertDanhMuc(model);
            
            RequestDispatcher rd = request.getRequestDispatcher("ListAccounts");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        
        }
    }

}
