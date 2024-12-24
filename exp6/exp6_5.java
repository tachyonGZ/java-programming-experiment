import java.io.*;
import java.net.*;
import java.sql.*;

public class Main {
	public static void main(String[] args) {
		int port = 12345;
		try (ServerSocket server_socket = new ServerSocket(port)) {
			while (true) {
				Socket client_socket = server_socket.accept();

				BufferedReader in = new BufferedReader(new InputStreamReader(client_socket.getInputStream()));
				PrintWriter out = new PrintWriter(client_socket.getOutputStream(), true);

				String message = in.readLine();
				System.out.println("from client:" + message);

				out.println("Hello Client");

				String url = "jdbc:mysql://localhost:3306/JDBCTest";
				String user = "root";
				String password = "";

				String insert_sql = "INSERT INTO client_messages (message, received_time) VALUES (?, NOW())";
				try(
					Connection connection = DriverManager.getConnection(url, user, password);
					PreparedStatement prepared_statement = connection.prepareStatement(insert_sql);
				) {
					prepared_statement.setString(1, message);
					prepared_statement.executeUpdate();
				}catch (SQLException e) {
					e.printStackTrace();
            	}

				client_socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}