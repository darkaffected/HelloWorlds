package bfarias;

import java.util.Scanner;

public class Phonetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Phonetic Translator - B. Farias\n");
		System.out.println("Enter a phrase: ");
		Scanner keyboard = new Scanner(System.in);
		while(true){
			String letter = keyboard.nextLine();	
            if(letter.equalsIgnoreCase("done")){
            	System.out.println("Bye!");
            	break;
            }
            
            
            int i = 0;
            
            while(i < letter.length()){
                if(letter.charAt(i) == ' '){
                        System.out.println();
                    }
                
                    getWord(letter.charAt(i));
                    i++;
            }
            System.out.println();
		}//while loop
        }//main end
        
        public static void getWord(char a){
		switch(a){
		case 'A': 
			System.out.print("Alpha ");
			break;
		case 'a':
			System.out.print("Alpha ");
			break;
		case 'B':
			System.out.print("Bravo ");
			break;
		case 'b':
			System.out.print("Bravo ");
			break;
		case 'C':
			System.out.print("Charlie ");
			break;
		case 'c':
			System.out.print("Charlie ");
                        break;
		case 'D': 
			System.out.print("Delta ");
			break;
		case 'd':
			System.out.print("Delta ");
			break;	
		case 'E': 
			System.out.print("Echo ");
			break;
		case 'e':
			System.out.print("Echo ");
			break;
		case 'F': 
			System.out.print("Foxtrot ");
			break;
		case 'f':
			System.out.print("Foxtrot ");
			break;
		case 'G': 
			System.out.print("Golf ");
			break;
		case 'g':
			System.out.print("Golf ");
			break;
		case 'H': 
			System.out.print("Hotel ");
			break;
		case 'h':
			System.out.print("Hotal ");
			break;
		case 'I': 
			System.out.print("India ");
			break;
		case 'i':
			System.out.print("India ");
			break;
		case 'J': 
			System.out.print("Juliet ");
			break;
		case 'j':
			System.out.print("Juliet ");
                        break;
		case 'K': 
			System.out.print("Kilo ");
			break;
		case 'k':
			System.out.print("Kilo ");
			break;
		case 'L': 
			System.out.print("Lima ");
			break;
		case 'l':
			System.out.print("Lima ");
			break;
		case 'M': 
			System.out.print("Mike ");
			break;
		case 'm':
			System.out.print("Mike ");
			break;
		case 'N': 
			System.out.print("November ");
			break;
		case 'n':
			System.out.print("November ");
			break;
		case 'O': 
			System.out.print("Oscar ");
			break;
		case 'o':
			System.out.print("Oscar ");
                        break;
		case 'P': 
			System.out.print("Papa ");
			break;
		case 'p':
			System.out.print("Papa ");
			break;
		case 'Q': 
			System.out.print("Quebec ");
			break;
		case 'q':
			System.out.print("Quebec ");
			break;
		case 'R': 
			System.out.print("Romeo ");
			break;
		case 'r':
			System.out.print("Romeo ");
			break;
		case 'S': 
			System.out.print("Sierra ");
			break;
		case 's':
			System.out.print("Sierra ");
			break;
		case 'T': 
			System.out.print("Tango ");
			break;
		case 't':
			System.out.print("Tango ");
			break;
		case 'U': 
			System.out.print("Uniform ");
			break;
		case 'u':
			System.out.print("Uniform ");
			break;
		case 'V': 
			System.out.print("Victor ");
			break;
		case 'v':
			System.out.print("Victor ");
			break;
		case 'W': 
			System.out.print("Whiskey ");
			break;
		case 'w':
			System.out.print("Whiskey ");
			break;
		case 'X': 
			System.out.print("X-Ray ");
			break;
		case 'x':
			System.out.print("X-Ray ");
			break;
		case 'Y': 
			System.out.print("Yankee ");
			break;
		case 'y':
			System.out.print("Yankee ");
			break;
		case 'Z': 
			System.out.print("Zulu ");
			break;
		case 'z':
			System.out.print("Zulu ");
			break;
		
		default:
                    if(a == ' '){
                        break;
                    }
                        System.out.print(a + " ");
			break;
                }
	}// getWord ends
	}


