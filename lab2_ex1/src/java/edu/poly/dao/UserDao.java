/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.dao;

import edu.poly.helpers.DatabaseHelper;
import edu.poly.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author MINH
 */
public class UserDao {

    public boolean insertUser(User user) throws Exception {
        String sql = "insert into [user](password,name,gender)" + "values(?,?,?)";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, user.getPassword());
            pstmt.setString(2, user.getName());
            pstmt.setBoolean(3, user.isGender());
            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean updateUser(User user) throws Exception {
        String sql = "updeta[user] set name=?,password=?,gender=?" + "where username=?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(2, user.getPassword());
            pstmt.setString(1, user.getName());
            pstmt.setBoolean(3, user.isGender());
            pstmt.setInt(4, user.getUsername());

            return pstmt.executeUpdate() > 0;
        }
    }

    public User findByID(int username) throws Exception {
        String sql = "select*from [user]where username=?";

        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setInt(1, username);
            try (ResultSet rs = pstmt.executeQuery();) {

                if (rs.next()) {
                    User user = new User();
                    user.setUsername((rs.getInt("Username")));
                    user.setName(rs.getString("name"));
                    user.setPassword(rs.getString("password"));
                    user.setGender(rs.getBoolean("gender"));
                    return user;
                }
              
            }
            return  null;
        }
    }
    

    public List<User> findAll() throws Exception {
        List<User> list = new ArrayList<>();
        String sql = "select*from[user]";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                User user = new User();
                user.setUsername((rs.getInt("Username")));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setGender(rs.getBoolean("gender"));
                list.add(user);
            }
            return list;
        }
    }
}

  
