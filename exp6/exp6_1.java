import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String hostname = scanner.nextLine();
		try {
			InetAddress inetAddress = InetAddress.getByName(hostname);
			String ipAddress = inetAddress.getHostAddress();
			System.out.println(ipAddress);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}