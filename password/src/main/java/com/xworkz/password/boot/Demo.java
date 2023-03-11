package com.xworkz.password.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/charlie","root","Xworkzodc@123");
			String insertQuerry = "insert into jdbc_table values(1,'Ravitej',24,'Ballari')";
			Statement statement = connection.createStatement();
			int i = statement.executeUpdate(insertQuerry);
			System.out.println("i" + i);
			connection.close();
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
