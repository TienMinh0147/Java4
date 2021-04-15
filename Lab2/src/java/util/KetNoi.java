/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class KetNoi {

    public KetNoi() {
    }
    
    public Connection getConnect(){
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLDienThoai;";
            con = DriverManager.getConnection(url, "sa", "password=123456;");
        } catch (Exception e) {
        }
        return con;
    }
}
