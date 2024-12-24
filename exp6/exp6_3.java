import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "";

		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();

			String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS JDBCTest";
			statement.executeUpdate(createDatabaseSQL);

			String useDatabaseSQL = "USE JDBCTest";
			statement.executeUpdate(useDatabaseSQL);

			String createTableSQL = "CREATE TABLE IF NOT EXISTS website (" +
									"name VARCHAR(255), " +
									"alexa INT, " +
									"country VARCHAR(100))";
			statement.executeUpdate(createTableSQL);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}