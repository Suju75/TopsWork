package com.InttoductionToJdbc;

/*
 * 1) Write a program that retrieves and displays column names, types, and count of a
    ResultSet using ResultSetMetaData.
 */

import java.sql.*;

public class ResultsetMetadata {
	public static void main(String[] args) {
		

		String url = "jdbc:mysql://localhost:3306/15janjava";
		String uname = "root";
		String pass = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from liblary");
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println(rsmd.getColumnLabel(1));
			System.out.println(rsmd.getColumnLabel(2));
			System.out.println(rsmd.getColumnLabel(3));
			System.out.println(rsmd.getColumnLabel(4));
			System.out.println(rsmd.getColumnLabel(5));
			System.out.println(rsmd.getColumnTypeName(1));
			System.out.println(rsmd.getColumnTypeName(2));
			System.out.println(rsmd.getColumnTypeName(3));
			System.out.println(rsmd.getColumnTypeName(4));
			System.out.println(rsmd.getColumnTypeName(5));
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getTableName(1));
			

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
