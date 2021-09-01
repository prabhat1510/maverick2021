package com.jdbcapp.trg.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MySQLDataSource {

	public static DataSource getMySQLDataSource() {
		Properties props = new Properties();
		FileInputStream fis = null;
		MysqlDataSource mysqlDS = null;
		try {
			fis = new FileInputStream("resource/jdbc.properties");
			props.load(fis);
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL(props.getProperty("MYSQL_URL"));
			mysqlDS.setUser(props.getProperty("MYSQL_USERNAME"));
			mysqlDS.setPassword(props.getProperty("MYSQL_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mysqlDS;
	}
	
	
		
}