import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FormatiertesSchreiben {

	public static void main(String[] args) {
	try {
			Scanner scan = new Scanner(System.in);
			String path = "formatiertesSchreiben.txt";
			File gameJamFile = new File(path);
			String textInput;
			FileWriter fileWriter = new FileWriter(gameJamFile,true);
			FileReader fileReader = new FileReader(gameJamFile);
			
			
			BufferedWriter bufferedWriter= new BufferedWriter (fileWriter);
			
			
				System.out.print("enter group name(max20)");
				textInput = scan.next();
				if (textInput.length()>20) {
					System.out.print("name too long");
				}
				else {bufferedWriter.write(textInput);
				bufferedWriter.flush();
				System.out.println(textInput);}
				
				System.out.print("enter Vor-Nachname (max50)");
				textInput = scan.next();
				if (textInput.length()>50) {
					System.out.print("name too long");
				}
				
				else {
					
				String filler="";
				int fill=50-textInput.length();
				
				for (int i=0;i<fill;i++) {
					char space ='_';
					filler= filler + space;
				}
				textInput=textInput+filler;
				bufferedWriter.write(textInput);
				bufferedWriter.flush();
				System.out.println(textInput);}
				
				System.out.print("enter age");
				textInput = scan.next();
				bufferedWriter.write(textInput);
				bufferedWriter.flush();
				
				System.out.print("enter studiengang");
				textInput = scan.next();
				bufferedWriter.write(textInput);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				
				
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
