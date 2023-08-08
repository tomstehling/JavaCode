package test.TicTacToe;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import main.TicTacToe.*;






public class JUnit {
	
	@Before
	void init()
	{
	TicTacToe.setPlayground();
	}	
	
	
	@Test
	void gameover() {
		//Arrange
		boolean expectedResult=true;
		//Act
		TicTacToe.setPlayground();
		System.out.print(TicTacToe.getPlayground());
		
		for(int i=0;i<9;i++){
			TicTacToe.setSymbol('x',i);}
		System.out.print(TicTacToe.getPlayground());
		
		boolean actualResult= TicTacToe.isGameEnd();
		//Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void checkWinner() {
		//Arrange
		boolean expectedResult=true;
		//Act
		
		TicTacToe.setSymbol('x', 0);
		TicTacToe.setSymbol('x', 1);
		TicTacToe.setSymbol('x', 2);
		boolean actualResult=TicTacToe.hasWon();
		//Assert
	
	}
	@Test
	void tryInput() {
		//Arrange
		char symbol='x';
		char expectedResult = symbol ;
		//Act
		int index = 2;
		TicTacToe.setSymbol(symbol, index);
		char actualResult= TicTacToe.getPlayground()[index];
		//Assert
		assertEquals(expectedResult,actualResult);
	}
	

}

