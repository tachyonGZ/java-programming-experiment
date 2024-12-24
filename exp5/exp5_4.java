import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringHashToFile {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		

        String path = "hash.txt";

        SaveHashToFile(text, path);

		System.out.println(ReadHashFromFile(path));
    }

    private static void SaveHashToFile(String text, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(Integer.toString(text.hashCode()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String ReadHashFromFile(String path) {
		String hash = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
        	hash = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

		return hash;
    }
}