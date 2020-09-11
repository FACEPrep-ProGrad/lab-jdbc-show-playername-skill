package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	public static Connection getConnection() throws Exception {

		// create the connection to the database
		Connection connection = null;

		// load the properties from file
		Properties properties = new Properties();
		properties = loadPropertiesFile();
		String driverString = properties.getProperty("driver");
		String urlString = properties.getProperty("url");
		String usernameString = properties.getProperty("username");
		// establishing the connection to the data
		String passwordString = properties.getProperty("password");

		Class.forName(driverString);
		connection = DriverManager.getConnection(urlString, usernameString, passwordString);
		return connection;
	}

	public static Properties loadPropertiesFile() throws Exception {
		Properties properties = new Properties();
		InputStream input = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		properties.load(input);
		input.close();
		return properties;
	}
}
