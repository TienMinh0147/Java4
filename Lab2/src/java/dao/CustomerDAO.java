/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Customer;
import util.KetNoi;


public class CustomerDAO {
    private Customer customer;

    public CustomerDAO() {
    }

    public CustomerDAO(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public ArrayList<CustomerDAO> serach(String tenbao){
        try {
            ArrayList<CustomerDAO> list = new ArrayList<CustomerDAO>();
            Connection con = new KetNoi().getConnect();
            String sql = "select * from customer where TenThueBao like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + tenbao + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String tenThueBao = rs.getString(2);
                String soDT = rs.getString(3);
                String diaChi = rs.getString(4);
                Customer cus = new Customer(id, tenThueBao, soDT, diaChi);
                CustomerDAO dao = new CustomerDAO(cus);
                list.add(dao);
            }
            rs.close();
            ps.close();
            con.close();
            return list;
        } catch (Exception e) {}
        return null;
    }
}
