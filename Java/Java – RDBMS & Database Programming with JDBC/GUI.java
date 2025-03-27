package com.InttoductionToJdbc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class GUI {

	private JFrame frame;
	private JTextField fname1;
	private JTextField lname1;
	private JTextField email1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
		connection();
		loaddata();
	}

	Connection con = null;
	private JTable t;
	private JTextField id1;

	private void connection() {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/15janjava";
		String uname = "root";
		String pass = "root";

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pass);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void loaddata() {
		// TODO Auto-generated method stub
		PreparedStatement pst;
		try {
			pst = con.prepareStatement("select * from assuser");
			ResultSet rs = pst.executeQuery();
			
			t.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1014, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel fname = new JLabel("FIRST NAME");
		fname.setFont(new Font("Tahoma", Font.BOLD, 10));
		fname.setBounds(50, 130, 100, 20);
		frame.getContentPane().add(fname);
		
		JLabel lname = new JLabel("LAST NAME");
		lname.setFont(new Font("Tahoma", Font.BOLD, 10));
		lname.setBounds(50, 176, 100, 20);
		frame.getContentPane().add(lname);
		
		JLabel email = new JLabel("EMAIL");
		email.setFont(new Font("Tahoma", Font.BOLD, 10));
		email.setBounds(50, 220, 100, 20);
		frame.getContentPane().add(email);
		
		fname1 = new JTextField();
		fname1.setColumns(10);
		fname1.setBounds(223, 131, 200, 25);
		frame.getContentPane().add(fname1);
		
		lname1 = new JTextField();
		lname1.setColumns(10);
		lname1.setBounds(223, 177, 200, 25);
		frame.getContentPane().add(lname1);
		
		email1 = new JTextField();
		email1.setColumns(10);
		email1.setBounds(223, 221, 200, 25);
		frame.getContentPane().add(email1);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String ufname = fname1.getText();
				 String ulname= lname1.getText();
				 String uemail = email1.getText();
				 
				try {
					PreparedStatement pst = con.prepareStatement("insert into assuser values(?,?,?,?)");
					pst.setInt(1, 0);
					pst.setString(2, ufname);
					pst.setString(3, ulname);
					pst.setString(4, uemail);
					int i = pst.executeUpdate();
					
					if(i > 0) {
						JOptionPane.showMessageDialog(frame, "Data inserted...");
						loaddata();
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 10));
		insert.setBounds(50, 303, 125, 30);
		frame.getContentPane().add(insert);
		
		JButton update = new JButton("UPDATE");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String ufname = fname1.getText();
				 String ulname= lname1.getText();
				 String uemail = email1.getText();
				 String uid = id1.getText();
				 
				 int uid1 = Integer.parseInt(uid);
				 
				try {
					PreparedStatement pst = con.prepareStatement("update assuser set fname = ?,lname = ?,email = ? where id = ?");
					
					pst.setString(1, ufname);
					pst.setString(2, ulname);
					pst.setString(3, uemail);
					pst.setInt(4, uid1);
					
					long i = pst.executeUpdate();
					
					if(i > 0) {
						JOptionPane.showMessageDialog(frame," Data updated...");
						loaddata();
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		update.setFont(new Font("Tahoma", Font.BOLD, 10));
		update.setBounds(298, 303, 125, 30);
		frame.getContentPane().add(update);
		
		t = new JTable();
		t.setBounds(468, 83, 507, 348);
		frame.getContentPane().add(t);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(780, 349, 17, 48);
		frame.getContentPane().add(scrollBar);
		
		JPanel panel = new JPanel();
		panel.setBounds(57, 484, 902, 173);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel id = new JLabel("ID");
		id.setBounds(32, 62, 53, 25);
		panel.add(id);
		id.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		id1 = new JTextField();
		id1.setColumns(10);
		id1.setBounds(80, 65, 101, 25);
		panel.add(id1);
		
		JButton search = new JButton("SEARCH");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String ufname = fname1.getText();
				 
				 PreparedStatement pst;
				try {
					pst = con.prepareStatement("select * from assuser where fname = ?");
					pst.setString(1, ufname);
					ResultSet rs = pst.executeQuery();
					
						t.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		search.setFont(new Font("Tahoma", Font.BOLD, 10));
		search.setBounds(304, 64, 125, 30);
		panel.add(search);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                 String uid = id1.getText();
				 int uid1 = Integer.parseInt(uid);
			
				try {
					
					PreparedStatement pst = con.prepareStatement("delete from assuser where id = ?");
					pst.setInt(1, uid1);
					int i = pst.executeUpdate();
					
					if(i > 0) {
						JOptionPane.showMessageDialog(frame," Data deleted...");
						loaddata();
						
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 10));
		delete.setBounds(439, 64, 125, 30);
		panel.add(delete);
		
	}
}
