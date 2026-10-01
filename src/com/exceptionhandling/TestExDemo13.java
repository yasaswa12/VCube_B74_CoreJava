package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExDemo13 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Object obj=Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(obj);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube","root","yasaswa@1234");
		Statement stmt=con.createStatement();
		String sql="select * from student";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("-----------------------");
			System.out.print(rs.getInt(1)+" | ");
			System.out.print(rs.getString(2)+" | ");
			System.out.println(rs.getInt(3)+" | ");
			//System.out.println("-----------------------");
		}
		
	}

}
