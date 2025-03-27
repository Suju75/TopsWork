package com.InttoductionToJdbc;

import java.sql.*;


public class ShowTableList {
	public static void main(String[] args) {
		

		String url = "jdbc:mysql://localhost:3306/15janjava";
		String uname = "root";
		String pass = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Show tables");
			
			 System.out.println("Tables in the Database:");
	            while (rs.next()) {
	                System.out.println(rs.getString(1)); 
	            }

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}