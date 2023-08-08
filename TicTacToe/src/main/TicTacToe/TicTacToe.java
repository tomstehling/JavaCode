package main.TicTacToe;
import java.util.*;
 
public class TicTacToe {
   
    static char[] playground;
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
      
 
        setPlayground();
 
        printPlayground();
        
        int i =0;
        char symbol;
        while ((hasWon()==false) && isGameEnd()==false) {
            int input;
            input = in.nextInt();
            i++;
            if (i%2==0) {
            symbol='x';
            }
            else {symbol='o';}
            setSymbol(symbol,input);
            
            printPlayground();
            System.out.println(hasWon());
            
        }
        System.out.println("Game Over");
        in.close();
    }
    
    public static boolean hasWon() {
    	     if((playground[0] == playground[1] && playground[1] == playground[2])) {return true;}
    	else if((playground[3] == playground[4] && playground[4] == playground[5])) {return true;}
    	else if((playground[6] == playground[7] && playground[7] == playground[8])) {return true;}
    	
    	else if((playground[0] == playground[3] && playground[3] == playground[6])) {return true;}
    	else if((playground[1] == playground[4] && playground[4] == playground[7])) {return true;}
    	else if((playground[2] == playground[5] && playground[5] == playground[8])) {return true;}
    	
    	else if((playground[0] == playground[4] && playground[4] == playground[8])) {return true;}
    	else if((playground[6] == playground[4] && playground[4] == playground[2])) {return true;}
    	else {return false;}
    }
    
  
    public static void printPlayground()
    {
        System.out.println(playground[0] + "-" + playground[1] + "-"+ playground[2]);
        System.out.println(playground[3] + "-" + playground[4] + "-"+ playground[5]);
        System.out.println(playground[6] + "-" + playground[7] + "-"+ playground[8]);
    }
    
    public static boolean isGameEnd() {
    	int j=0;
    	for (int i=0;i<9;i++) {
    		if (playground[i]=='x' || playground[i]=='o' ) {
    			j=j+1;
    		}
    	}
    	if (j<9) {return false;}
    	else {return true;}
    }
    public static void setSymbol(char symbol, int input) {
    	playground[input]=symbol;
    }
    
    public static void setPlayground() {
    	playground = new char[9];
    	for (int i = 0; i < 9; i++) {
            playground[i] = (char)(i+'0');
        }

    	
    }
    
	public static char[] getPlayground() {
	    	return playground;
	    }
    
}