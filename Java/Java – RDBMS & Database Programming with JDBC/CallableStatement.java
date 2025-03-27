package com.InttoductionToJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatement {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/15janjava";
		String uname = "root";
		String pass = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			
			java.sql.CallableStatement cst = con.prepareCall("call showemp()");
			
			ResultSet rs = cst.executeQuery();
			
			while(rs.next()) {
			   int id = rs.getInt(1);
			   String name = rs.getString(2);
			   String dep = rs.getString(3);
			   double sal = rs.getDouble(4);
			   
			   System.out.println(id+" "+name+" "+dep+" "+sal);
				
			}
			
			con.close();
			rs.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
