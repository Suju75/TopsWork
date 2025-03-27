package com.InttoductionToJdbc;
import java.sql.*;

/*
 * 1) Write a program that retrieves and displays metadata information about your
      database using DatabaseMetaData.
   2) Display database name, version, list of tables, and supported SQL features
 */


public class MetadataLab1 {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/15janjava";
		String uname = "root";
		String pass = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			
			DatabaseMetaData dbmd = con.getMetaData();
			
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDatabaseMinorVersion());
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDefaultTransactionIsolation());
			System.out.println(dbmd.getDriverMajorVersion());
			System.out.println(dbmd.getDriverMinorVersion());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
			System.out.println(dbmd.getJDBCMajorVersion());
			System.out.println(dbmd.getDatabaseMinorVersion());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
