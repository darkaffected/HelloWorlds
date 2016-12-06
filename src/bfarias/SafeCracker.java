package bfarias;
import java.util.*;
public class SafeCracker {

	public static void main(String[] args) {
	
		System.out.println("Safe Cracker Jr. - B. Farias \n");
		System.out.println("What is your guess?");
	        
        Scanner input = new Scanner(System.in);
	       Random random = new Random();
	       int key;
	       int guess, games = 0;
	       int score = 0;
	       int highScore = 9999;
	       String choice;
	        
	       key = random.nextInt(9999);
	        
	       while(true){
	           guess = input.nextInt();
                   
	           if (guess == key) {   
	           if(score < highScore){
	                highScore = score;
	                }
	              System.out.println("You got it!");
	              System.out.println("Your score was:" + score);
	                games++;
	                key = random.nextInt(10);
	                score = 0;
	                
	                System.out.print("Would you like to play again? ");
                        
                        choice = input.next();
                        
	            if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("yeah")){
	                
                        }else{
                        break;
                    }
                    }
                   
                   if(games > 0){
	                System.out.println("The highscore is: " + highScore);
	                }else if (guess < key) {
	                System.out.println("Number is to small");
                        } else if (guess > key) {
	                System.out.println("Number is to big");
	            }
                   score++;
	        }
	    }
	}