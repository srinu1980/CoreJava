package com.cts.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	String driverClassName = "com.mysql.cj.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/employeedb";
	String dbUser = "root";
	String dbPwd = "admin123";

	private static ConnectionFactory connectionFactory = null;

	private ConnectionFactory() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
		return conn;
	}

	public static ConnectionFactory getInstance() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory;
	}
}
