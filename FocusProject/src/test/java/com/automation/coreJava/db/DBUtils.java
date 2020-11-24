package com.automation.coreJava.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {

	public ResultSet executeQuery(String strQuery) {
		ResultSet resultSet = null;
		Connection connection = null;
		Statement statement = null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("URL+DBName", "UserName","Password");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(strQuery);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception);
		} finally {
			try {
				if (statement != null) {
					statement = null;
				}
				if (connection != null) {
					connection.close();
					connection = null;
				}
			} catch (SQLException sqlException) {
				System.out.println("Exception:" + sqlException);
			}
		}
		return resultSet;
	}

}
