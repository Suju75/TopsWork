package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import model.User;
import util.DBconnection;

public class UserDao {

	Connection con;

	public UserDao() {
		con = DBconnection.getConnection();
	}

	public int registerUser(User u) {
		int i = 0;
		try {
			PreparedStatement ps1 = con.prepareStatement("select * from register where email=?");
			ps1.setString(1, u.getEmail());

			ResultSet rs = ps1.executeQuery();

			if (rs.next()) {
				System.out.println("Email Already Register");
			} else {

				PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?)");
				ps.setInt(1, 0);
				ps.setString(2, u.getFname());
				ps.setString(3, u.getLname());
				ps.setString(4, u.getEmail());
				ps.setString(5, u.getMobNo());
				ps.setString(6, u.getAddress());
				ps.setString(7, u.getGender());
				ps.setString(8, u.getPass());
				i = ps.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}

	public User login(String email, String pass) {

		User u = null;

		try {
			PreparedStatement ps = con.prepareStatement("select * from register where email=? and pass=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new User();
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString("email"));
				u.setPass(rs.getString("pass"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return u;

	}

	public User verifyEmail(String email) {
		User u = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from register where email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new User();
				u.setEmail(rs.getString("email"));
				u.setPass(rs.getString("pass"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	public int updatePasswordInDatabase(String email, String newPassword) {
		int i = 0;

		try {
			PreparedStatement ps = con.prepareStatement("UPDATE register SET pass = ? WHERE email = ?");
			ps.setString(1, newPassword); // New password (Hash it before setting)
			ps.setString(2, email);
			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public int changepass(String oldPassword, String newPassword, String confirmPassword, String email) {
		int i = 0;

		try {
			PreparedStatement ps = con.prepareStatement("select * from register where email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String oldpass = rs.getString("pass");
				if (!oldPassword.equals(oldpass)) {
					System.out.println("Password match");
				} else if (!newPassword.equals(confirmPassword)) {
					System.out.println("check Password");
				} else {
					PreparedStatement ps1 = con.prepareStatement("update register set pass=? where email=?");
					ps1.setString(1, newPassword);
					ps1.setString(2, email);
					i = ps1.executeUpdate();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

}
