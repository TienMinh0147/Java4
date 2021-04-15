package com.example.giaima;

import com.example.giaima.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Lonely
 */
public class SanPhamDAO {

    private Connection connect = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ConnectDB connectdb;

    public SanPhamDAO() {
        connectdb = new ConnectDB();
    }

    public ArrayList<SanPham> getAllProducts() throws Exception {
        ArrayList<SanPham> lst = new ArrayList<SanPham>();
        String strSQL = "select * from SanPham";
        try {
          
            while (rs.next()) {
                String ms = rs.getString("masp");
                String ten = rs.getString("tensp");
                String ncc = rs.getString("nhacc");
                double gia = Double.parseDouble(rs.getString("giadv"));
                SanPham sp = new SanPham(ms, ten, ncc, gia);
                lst.add(sp);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage() + " Error at : " + strSQL);
        }
      
        return lst;
    }

    public boolean insertNew(SanPham sp) throws Exception {
        String sql = "insert into SanPham values(?,?,?,?)";
    
        pst.setString(1, sp.getMasp());
        pst.setString(2, sp.getTensp());
        pst.setString(3, sp.getNhacc());
        pst.setDouble(4, sp.getGiadv());

        return pst.executeUpdate() > 0;

    }

    public boolean deleteProduct(String masp) throws Exception {
        String sql = "delete from SanPham where masp=?";
       
        pst.setString(1, masp);
        return pst.executeUpdate() > 0;
    }

    public int executeUpdate(String strSQL) throws Exception {
        int result = 0;
        try {
         
        } catch (Exception ex) {
            throw new Exception(ex.getMessage() + " Error at: " + strSQL);
        } finally {
           
        }
        return result;
    }

    public SanPham getProductByID(String masp) throws Exception {
        String sql = "select * from SanPham where masp=?";
      
        pst.setString(1, masp);
        ResultSet rs = pst.executeQuery();
        SanPham sp = null;
        if (rs.next()) {
            String ms = rs.getString("masp");
            String ten = rs.getString("tensp");
            String ncc = rs.getString("nhacc");
            double gia = Double.parseDouble(rs.getString("giadv"));
            sp = new SanPham(ms, ten, ncc, gia);
        }
        return sp;
    }

    public boolean UpdateProduct(String masp, SanPham newsp) throws Exception {
        String sql = "update sanpham set tensp=?, nhacc=?, giadv=? where masp=?";
        PreparedStatement pst = connectdb.openConnect().prepareStatement(sql);
        pst.setString(1, newsp.getTensp());
        pst.setString(2, newsp.getNhacc());
        pst.setDouble(3, newsp.getGiadv());
        pst.setString(4, newsp.getMasp());
        return pst.executeUpdate() > 0;
    }

}