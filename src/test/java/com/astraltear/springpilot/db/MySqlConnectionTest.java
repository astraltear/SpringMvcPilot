package com.astraltear.springpilot.db;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class MySqlConnectionTest {
	
/*	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://127.0.0.1:3306/spring_mvc";*/
	
	private static final String DRIVER="net.sf.log4jdbc.sql.jdbcapi.DriverSpy";
	private static final String URL="jdbc:log4jdbc:mysql://127.0.0.1:3306/spring_mvc";
	
	
	private static final String user="test";
	private static final String pw="test";

	@Test
	public void test() throws ClassNotFoundException {
		Class.forName(DRIVER);
		
		try(Connection connection = DriverManager.getConnection(URL,user,pw))  {
			System.out.println(connection.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("END!!!!!!!!!!!!!!!");
	}

}
