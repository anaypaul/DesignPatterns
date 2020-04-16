package com.creationalpattern.singleton;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance = DbSingleton.getInstance();
		
		long timeStart = 0;
		long timeStop = 0;
		
		System.out.println("address instance of DbSingleton class : " + instance);
		
		timeStart = System.currentTimeMillis();
		Connection conn = instance.getConnection();
		timeStop = System.currentTimeMillis();
		
		System.out.println("Connection object delay : "+ (timeStop - timeStart));
		
		Statement sta;
		try {
			sta = conn.createStatement();
			int count = sta
					.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
							+ " City VARCHAR(20))");
			
			if(count > 0) {
				System.out.println("Table created");
			}else {
				System.out.println("table creating failed");
			}
			sta.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		timeStart = System.currentTimeMillis();
		conn = instance.getConnection();
		timeStop = System.currentTimeMillis();
		
		System.out.println("Connection object delay 2nd time using singleton : "+ (timeStop - timeStart));
		
		System.out.println(conn);
		try {
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery("Select * from Address");
			System.out.println(rs);
			rs.close();
			sta.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
