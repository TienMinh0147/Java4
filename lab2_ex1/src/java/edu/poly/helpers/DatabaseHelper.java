/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.helpers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MINH
 */
public class DatabaseHelper {
    public static Connection openConnection() throws  Exception{
       String connectionUrl="jdbc:sqlserver://localhost:1433;"+"databaseName=DemoDB;User=sa;password=123456";
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       Connection con = DriverManager.getConnection(connectionUrl);
       return  con ;
    }

   
}
    

   

