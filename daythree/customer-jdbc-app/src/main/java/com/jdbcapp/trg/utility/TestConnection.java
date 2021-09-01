package com.jdbcapp.trg.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		//try (Connection connection = MySQLDataSource.getMySQLDataSource().getConnection();) {
		try (Connection connection =  DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/training", "postgres", "password");	) {
			if (connection != null) {
				System.out.println("Connected..");
			} else {
				System.out.println("Unable to connect");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
