package bfarias;
import java.util.*;
public class Hangman {
	
	private static String correctG = "";
	private static String wrongG = "";
	private static String userInput;
	private static String privateWord;
	private static int numGuesses;
	private static boolean endOfGame;
	public static void main(String[] args) 
	{ 
		Scanner input= new Scanner(System.in);
		
		
		word();
		System.out.println("Hangman - B.Farias");
		
		numGuesses = 0;
		drawboard();
	do {
		System.out.println();
		System.out.println("guess a letter!");
		userInput = input.nextLine().toLowerCase();
		numGuesses++;
		
		if (privateWord.indexOf(userInput) >= 0)
		{
			correctG = correctG + userInput;
		}
		else {
			wrongG = wrongG + userInput;
		}
		drawboard();
		System.out.print("  Used Letters: " + "{" + wrongG + "}");
		System.out.println();
		
	} while (endOfGame == false);
	
	System.out.print("Winner!");
	System.out.print("It took " + numGuesses + " guesses");
	}
	
	public static void drawboard() {
		int correctCount = 0;
		for (int x = 0; x < privateWord.length(); x++)
		{
			if (correctG.indexOf(privateWord.charAt(x)) >=0)
			{
				correctCount++;
				System.out.print(privateWord.charAt(x));
				
				if (correctCount == privateWord.length()) {
					endOfGame = true;
				}
			}
			else {
				System.out.print(" _");
			}
		
	}
	}
		
	public static String word() {
		int randomNumber = (int)(1 + Math.random()*6);
		
		switch (randomNumber)
		{
		case 1: privateWord = "lock";
		break;
		case 2: privateWord = "bolt";
		break;
		case 3: privateWord = "dirt";
		break;
		case 4: privateWord = "pancake";
		break;
		case 5: privateWord = "potato";
		break;
		}
			return privateWord;
		

				
	}

}
