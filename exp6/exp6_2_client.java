import java.io.*;
import java.net.*;

public class Main {
	public static void main(String[] args) {
		String server_address = "localhost";
		int port = 12345;
		try (Socket socket = new Socket(server_address, port)) {
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			out.println("Hello Server");

			System.out.println("from server:" + in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}