package com.atguigu.connection;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.NonRegisteringDriver;

public class ConnectionTest {
	
	
	public void testConnection1() throws SQLException {
		DriverAction driver = (DriverAction) new com.mysql.jdbc.Driver();
		
		String url = "jdbc:mysql://localhost:3306/test";
		Properties info = new Properties();
		info.setProperty("user","root");
		info.setProperty("password","qwe123");
		
		Connection conn = ((NonRegisteringDriver) driver).connect(url,info);
				
		System.out.println(conn);
		
		
	}
	

}
