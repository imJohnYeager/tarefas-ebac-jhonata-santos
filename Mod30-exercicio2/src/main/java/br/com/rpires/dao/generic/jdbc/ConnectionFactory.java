/**
 * 
 */
package br.com.rpires.dao.generic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author rodrigo.pires
 *
 */
public class ConnectionFactory {
	
	private static Connection connection;
	
	private ConnectionFactory(Connection connection) {
		
	}
	
	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			connection = initConnection();
			return connection;
		} else if (connection.isClosed()) {
			connection = initConnection();
			return connection;
		} else {
			return connection;
		}
	}
	
	private static Connection initConnection() {
		try{
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/projeto_jdbc?user=root",
					"root", "Gaby@2004");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
