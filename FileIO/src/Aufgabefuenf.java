import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Base64;
import java.util.Scanner;

public class Aufgabefuenf {

	static String filePath="byteFile";
	static File byteFile = new File(filePath);
	public static void main (String[] args) {
		try {
			OutputStream os = new FileOutputStream(byteFile);
			String text = "hallo das ist der Text";
			byte[] bytes = Base64.getEncoder().encode(text.getBytes());
			os.write(bytes);
			os.close();
		}
		catch(Exception e) {System.out.println("Exception thrown");}
		try {
			Scanner scan2 = new Scanner(byteFile);
			String txt = scan2.nextLine();
			byte[] decodedBytes = Base64.getDecoder().decode(txt);
			System.out.println("encryptedBytes->"+ txt + "<-decodedBytes->" + new String(decodedBytes));
			scan2.close();
			}
		catch(Exception e) {System.out.println("Exception thrown");}
	}
}
