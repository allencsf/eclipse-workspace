package com.atguigu.connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;



public class ConnectionTest {
	
	public void testConnection1() throws SQLException {
		Driver driver = new com.mysql.jdbc.Driver();
		
		String url = "jdbc:mysql://localhost:3306/test";
		Properties info = new Properties();
		info.setProperty("user","root");
		info.setProperty("password","qwe123");
		
		Connection conn = driver.connect(url,info);
				
		System.out.println(conn);
		
		

		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public void getConnection5() throws Exception {
//		InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
//		
//		Properties pros = new Properties();
//		
//		pros.load(is);
//		
//		String user =  pros.getProperty("user");
//		String password = pros.getProperty("password");
//		String url = pros.getProperty("url");
//		String driverClass = pros.getProperty("driverClass");
//		
//		Class.forName(driverClass);
//		
//		Connection conn = (Connection) DriverManager.getConnection(url,user,password);
//		
//		System.out.println(conn);
//	}
	
	
}
