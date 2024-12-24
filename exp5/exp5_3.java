import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String source_path = ".\\R.jpg";
		String destination_path = ".\\RR.jpg";

		byte[] image = FileToByteArray(source_path);
		ByteArrayToFile(image, destination_path);
	}

	private static byte[] FileToByteArray(String path){
		File file = new File(path);
		byte[] data = new byte[(int) file.length()];

		try {
			FileInputStream fis = new FileInputStream(file);
			fis.read(data);
		} catch (FileNotFoundException e) {
    		e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        }
		return data;
	}

	private static void ByteArrayToFile(byte[] data, String path){
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
		} catch (FileNotFoundException e) {
    		e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        }
	}
}