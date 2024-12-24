import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/JDBCTest";
		String user = "root";
		String password = "";

		Connection connection = null;
		PreparedStatement prepared_statement = null;

		try {
			connection = DriverManager.getConnection(url, user, password);

			String insert_sql = "INSERT INTO website (name, alexa, country) VALUES (?, ?, ?)";
			prepared_statement = connection.prepareStatement(insert_sql);

			prepared_statement.setString(1, "Example Site 1");
			prepared_statement.setInt(2, 1000);
			prepared_statement.setString(3, "USA");
			prepared_statement.executeUpdate();

			prepared_statement.setString(1, "Example Site 2");
			prepared_statement.setInt(2, 2000);
			prepared_statement.setString(3, "UK");
			prepared_statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (prepared_statement != null) {
					prepared_statement.close();
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