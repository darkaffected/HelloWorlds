package bfarias;
import java.util.Scanner;
	public class Palindrome {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Palindrome Checker - B. Farias\n");
			System.out.println("Type a Palindrome phrase: ");
			Scanner keyboard = new Scanner(System.in);
	        while (true) {
	        	String letter = keyboard.nextLine();
	        	if (letter.equalsIgnoreCase("done")){
	        		System.out.println("Bye!");
	        		break;
	        	}
	        	run (letter);
	        
	        }
	    }
		
			public static void run(String letter) {
	
				 String letterNoSpaces = ""; 
	                String wordBackwards = "";
	                
	                int e = 0;
	                while(e <= letter.length() - 1){
	                    char letters = letter.charAt(e);
	                    
	                    if(Character.isAlphabetic(letters)){
	                        letterNoSpaces += letter.charAt(e);
	                    }
	                    e++;
	                }
	                
	                letter = letterNoSpaces;
	                
	                int i = letter.length() - 1;
	                while(i >= 0){
	                    wordBackwards += letter.charAt(i);
	                    i--;
	                }
	                
	                if(letter.equalsIgnoreCase(wordBackwards)){
	                    System.out.println("That is a palindrome");
	                }else{
	                    System.out.println("That is not a palindrome");
	                }
			
			}
	}
