import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	try {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("enter a path: ");
			String path = scan.nextLine();
			File newFile = new File(path);
			String textInput;
			FileWriter fileWriter = new FileWriter(newFile,true);
			FileReader fileReader = new FileReader(newFile);
			
			Scanner scan2 = new Scanner(newFile);
			
			try (BufferedWriter bufferedWriter = new BufferedWriter (fileWriter)) {
				System.out.print("For write enter w, for read enter r");
				textInput = scan.nextLine();
				if ("w".equals(textInput)) {
					System.out.print("enter a text to write in file");
					textInput = scan.nextLine();
				
					while (!("Quit".equals(textInput))) {
					bufferedWriter.write(textInput);
					bufferedWriter.flush();
					textInput = scan.nextLine();
					System.out.println(textInput);
					}
				}
				else if ("r".equals(textInput)) {
					  while(scan2.hasNext()) {
						  System.out.println(scan2.nextLine());
					  
					  System.out.println();
					  fileReader.close();
				}}
				else {System.out.print("invalid Input");}
			}
			
			
			
			
			
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
