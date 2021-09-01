/**
 * 
 */
package com.jdbcapp.trg.utility;

/**
 * @author admi
 *
 */
/**
public class PostgresSQLDataSource {
	public static DataSource getPostgresSQLDataSource() {
		Properties props = new Properties();
		FileInputStream fis = null;
		//PostgresSQLDataSource postgressqlDS = null;
		try {
			fis = new FileInputStream("resource/jdbc.properties");
			props.load(fis);
			postgressqlDS = new PostgresSQLDataSource();
			postgressqlDS.setURL(props.getProperty("Postgres_URL"));
			postgressqlDS.setUser(props.getProperty("Postgres_USERNAME"));
			postgressqlDS.setPassword(props.getProperty("Postgres_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return postgressqlDS;
	}
}
**/