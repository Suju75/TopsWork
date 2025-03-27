package com.InttoductionToJdbc;

/*
 1)  Write a simple Java program to connect to a MySQL database using JDBC.
 2)  Demonstrate the process of loading a JDBC driver and establishing a connection.
 3)  Identify which driver your Java program uses to connect to MySQL.
 4)  Research and explain the best JDBC driver for your database and Java environment.
 5) Write a Java program to establish a connection to a database and print a
 confirmation message upon successful connection.
 6) Create a program that inserts, updates, selects, and deletes data using Statement.
 7) Modify the program to use Prepared Statement for parameterized queries.
 8) Write a Java program that performs the following CRUD operations:
  Insert a new record.
  Update an existing record.
  Select and display records.
  Delete a record from the database.
 9) Write a program that executes a SELECT query and processes the ResultSet to
 display records from the database.
 10) Demonstrate how to navigate through the ResultSet using methods like next(),
 previous(), etc.
 
 */



import java.sql.*;
import java.util.Scanner;

public class Lab1 {
	static Connection con = null;

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);

			String url = "jdbc:mysql://localhost:3306/15janjava";
			String uname = "root";
			String pass = "root";

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, uname, pass);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("1:- Insert books in the liblary.");
			System.out.println("2:- for view books in liblary.");
			System.out.println("3:- for issue book.");
			System.out.println("4:- Update book.");
			System.out.println("5:- delete books from the liblary.");
			System.out.println("6:- stop the function.");

			System.out.println("\n\n\nEnter option which opration you want to use.");
			int choose = sc.nextInt();
			
			if (choose == 6) {
				System.out.println("Thank u..");
				break;
			}
			switch (choose) {
			
			

			case 1:
				addbook();
				break;
			case 2:
				viewlibrary();
				break;
			case 3:
				issuebook();
				break;
			case 4:
				updatebook();
				break;
			case 5:
				deletebook();
				break;
			default:
				System.out.println("Enter valid option.");

			}

		}
	}
			
		

		

	private static void deletebook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name which you want to delete.");
		String book_name = sc.nextLine();
		
		try {
			PreparedStatement pst = con.prepareStatement("delete from liblary where book_name = ?");
			pst.setString(1, book_name);
			int i = pst.executeUpdate();
			
			if(i > 0) {
				System.out.println("Book is deleted.");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void updatebook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name which you want to update.");
		String old = sc.nextLine();
		
		System.out.println("Enter new book name.");
		String newbook = sc.nextLine();
		
		System.out.println("enter writer name.");
		String writer = sc.nextLine();
		
		System.out.println("Enter price.");
		double price = sc.nextDouble();
		
		System.out.println("Enter quantity.");
		int quantity = sc.nextInt();
		
		try {
			PreparedStatement pst = con.prepareStatement("update liblary set book_name = ?,writer_name = ?,price = ?,quantity = ? where book_name = ?");
			pst.setString(1, newbook);
			pst.setString(2, writer);
			pst.setDouble(3, price);
			pst.setInt(4, quantity);
			pst.setString(5, old);
			
			int i = pst.executeUpdate();
			
			if(i > 0) {
				System.out.println("Book is updated.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void addbook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Book name. ");
		String set_book = sc.nextLine();
		System.out.println("Enter writer name. ");
		String set_writer = sc.nextLine();
		System.out.println("Enter Book price. ");
		double set_price = sc.nextDouble();
		System.out.println("Enter Book quantity. ");
		int set_quantity = sc.nextInt();
		
		
		try {
			PreparedStatement pst = con.prepareStatement("insert into liblary values(?,?,?,?,?)");
			pst.setInt(1, 0);
			pst.setString(2, set_book);
			pst.setString(3, set_writer);
			pst.setDouble(4, set_price);
			pst.setInt(5, set_quantity);
			int i = pst.executeUpdate();
			if(i > 0) {
				System.out.println("Book inserted success fully.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Book is already exist.");
		}

	}

	private static void viewlibrary() {
		// TODO Auto-generated method stub
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from liblary");

			while (rs.next()) {

				int id = rs.getInt(1);
				String book_name = rs.getString(2);
				String writer_name = rs.getString(3);
				double price = rs.getDouble(4);
				int quantity = rs.getInt(5);

				System.out.println(id + " " + book_name + " " + writer_name + " " + price + " " + quantity);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void issuebook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from liblary");

			while (rs.next()) {

				int id = rs.getInt(1);
				String book_name = rs.getString(2);
				String writer_name = rs.getString(3);
				double price = rs.getDouble(4);
				int quantity = rs.getInt(5);

				System.out.println(id + " " + book_name + " " + writer_name + " " + price + " " + quantity);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\n\n\nEnter book name which book yo want.");
		String book_name = sc.nextLine();

		try {
			PreparedStatement pst = con.prepareStatement("select * from liblary where book_name = ?");
			pst.setString(1, book_name);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				String book_name1 = rs.getString(2);
				int quantity1 = rs.getInt(5);
				System.out.println(book_name1 + " " + quantity1);
				if (quantity1 > 0) {
					int current = quantity1 - 1;
					PreparedStatement pst1 = con.prepareStatement("update liblary set Quantity=? where book_name=? ");
					pst1.setInt(1, current);
					pst1.setString(2, book_name);
					int i = pst1.executeUpdate();
					if (i > 0) {
						System.out.println("Book is issues.");
						System.out.println("Book in stock is " + current + " " + book_name);
					}
				}

			} else {
				System.out.println("Book is not availabe now.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
