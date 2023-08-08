import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class BestenListe {
	static ArrayList<Score> scoreList=new ArrayList<>(); 
	static FileOutputStream fileOutputStream;
	static ObjectOutputStream objectOutputStream;
	static ObjectInputStream objectInputStream;
	static FileInputStream fileInputStream;
	static Object otherScoreList;
	
	public static void main(String[] args) {
		scoreList.add(new Score("Dragons", 55));
		scoreList.add(new Score("Vikings", 35));
		
		
		
		
		
		
		try {
			fileInputStream=new FileInputStream("obj.bin");
			objectInputStream= new ObjectInputStream(fileInputStream);
			
			try {
				otherScoreList = objectInputStream.readObject();
				if (otherScoreList instanceof ArrayList ) {
					ArrayList<Score> list =(ArrayList) otherScoreList; }
				objectInputStream.close();
				fileInputStream.close();
				
				//System.out.println(((Score)((ArrayList)otherScoreList).get(0)).getNickName() );
				for(int i=0;i<((ArrayList)otherScoreList).size();i++) {
					System.out.print(((Score)((ArrayList)otherScoreList).get(i)).getNickName()+" ");
					System.out.println(((Score)((ArrayList)otherScoreList).get(i)).getPunkte());
				}
			}
			
			
			 catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Scannercode
		Scanner scan = new Scanner(System.in);
		System.out.println("enter new Nickname");
		String newNickname=scan.nextLine();
		System.out.println("enter new Score");
		Integer newScore=Integer.valueOf(scan.nextLine());
		Score newScoreObject=new Score(newNickname,newScore);
		((ArrayList)otherScoreList).add(newScoreObject);
		
		System.out.println("enter new Nickname");
		newNickname=scan.nextLine();
		System.out.println("enter new Score");
		newScore=Integer.valueOf(scan.nextLine());
		newScoreObject=new Score(newNickname,newScore);
		((ArrayList)otherScoreList).add(newScoreObject);
		
		
		
		
		
		
		
		//
		try {
			fileOutputStream = new FileOutputStream("obj.bin");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(otherScoreList);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}