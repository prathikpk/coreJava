package com.Aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Insert {
	private static final String INSERT_QUERY="INSERT INTO EMP(EID,ENAME) VALUES(?,?)";
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root",
				"mysql2022");
				PreparedStatement ps =con.prepareStatement(INSERT_QUERY);) {
			System.out.println("Enter E_ID:");
			int eid=sc.nextInt();
			System.out.println("Enter E_Name:");
			String ename=sc.next();
			ps.setInt(1, eid);
			ps.setString(2, ename);
			
			
			int count=ps.executeUpdate();
			if(count==0) {
				System.out.println("Record not registered");
			}else {
				System.out.println("Record succesfully registered");
			}

		} catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
