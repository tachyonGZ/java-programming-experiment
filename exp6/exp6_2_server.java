import java.io.*;
import java.net.*;

public class Main {
	public static void main(String[] args) {
		int port = 12345;
		try (ServerSocket server_socket = new ServerSocket(port)) {
			while (true) {
				Socket client_socket = server_socket.accept();

				BufferedReader in = new BufferedReader(new InputStreamReader(client_socket.getInputStream()));
				PrintWriter out = new PrintWriter(client_socket.getOutputStream(), true);

				System.out.println("from client:" + in.readLine());

				out.println("Hello Client");

				client_socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}