/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.giaima;
    import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author MINH
 */
public class ConnectDB {



public class ConnectDb {
    public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Qlysach;user=sa;password=songlong");
            if (conn != null) {
                System.out.println(" Thành Công");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

