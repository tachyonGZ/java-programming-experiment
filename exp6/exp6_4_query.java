import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/JDBCTest";
		String user = "root";
		String password = "";

		Connection connection = null;
		Statement statement = null;
		ResultSet result_set = null;

		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();

			String query_sql = "SELECT * FROM website";
			result_set = statement.executeQuery(query_sql);

			while (result_set.next()) {
				String name = result_set.getString("name");
				int alexa = result_set.getInt("alexa");
				String country = result_set.getString("country");
				System.out.println("{name:\"" + name + "\",alexa:" + alexa + ",country:\"" + country + "\"");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (result_set != null) {
					result_set.close();
				}
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