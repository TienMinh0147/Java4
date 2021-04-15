/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author TUYETTRAN
 */
import Model.User;
import View.AddUserFrm;
import View.SearchUserFrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserDAO {
	private Connection con;
	private User user;
	private AddUserFrm auf;
	private SearchUserFrm suf;

	public UserDAO() {
		String dbUrl = "jdbc:jtds:sqlserver://localhost:1433/QLBanVeXemPhim";
		String dbClass = "net.sourceforge.jtds.jdbc.Driver";

		try {
			Class.forName(dbClass);
			con = DriverManager.getConnection(dbUrl, "sa", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addUser(User user) {
		String sql = "INSERT INTO tblUser(id, usename, password, fullname, position) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user.getId());
			ps.setString(2, user.getUsename());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getFullname());
			ps.setString(5, user.getPosition());

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet getUsers(String username) {
		ResultSet rs = null;
		String sqlCommand = "SELECT * FROM tblUser WHERE usename LIKE '%"
				+ username + "%'";
		PreparedStatement pst;
		try {
			pst = con
					.prepareStatement(sqlCommand,
							ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_READ_ONLY);
			rs = pst.executeQuery();
		} catch (SQLException ex) {
			System.out.println("search err " + ex.toString());
		}
		return rs;
	}

	public ResultSet getUsers(int id) {
		ResultSet rs = null;
		String sqlCommand = "select * from tblUser where id = ?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sqlCommand);
			pst.setInt(1, id);
			rs = pst.executeQuery();
		} catch (SQLException ex) {
			System.out.println("search err " + ex.toString());
		}
		return rs;
	}

	public void deleteUser(int id) {
		String sqlCommand = "DELETE FROM tblUser WHERE id = ?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sqlCommand);
			pst.setInt(1, id);
			if (pst.executeUpdate() > 0)
				System.out.println("delete success");
			else
				System.out.println("delete err");
		} catch (SQLException ex) {
			System.out.println("delete err " + ex.toString());
		}

	}

	public void updateUser(int id, User u) {
		String sqlCommand = "update tblUser set usename = ?,password = ?,fullname = ?, position = ? where id = ?";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sqlCommand);
			pst.setInt(5, id);
			pst.setString(1, u.getUsename());
			pst.setString(2, u.getPassword());
			pst.setString(3, u.getFullname());
			pst.setString(4, u.getPosition());
			if (pst.executeUpdate() > 0)
				System.out.println("update success");
			else
				System.out.println("update err");
		} catch (SQLException ex) {
			Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null,
					ex);
		}
	}

	public boolean userExited(int id) {
		ResultSet rs = null;
		String sqlCommand = "select * from tblUser where id = ?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sqlCommand);
			pst.setInt(1, id);
			rs = pst.executeQuery();
		} catch (SQLException ex) {
			System.out.println("search err " + ex.toString());
		}
		if (rs == null)
			return true;
		else
			return false;
	}
}
