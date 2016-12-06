package bfarias;
import java.util.*;
public class RpgGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean live = true;
		
		System.out.println("This is a fantasy game based in the medievil time period. Would you like to play?");
		System.out.println("a. Yes\nb. No");
		String one = input.nextLine();
		one = one.toLowerCase();
		while (live == true) {
			if (one .equals("a")) {
				System.out.println("You are a warrior that just awoke from your slumber outside the town's pub. You've had many drinks\nthe night before and you need to find a remedy for your hangover. What shall you do?");
				System.out.println("a. Wander into the forrest\nb. Look for a doctor in town");
				break;
			}
			else if (one .equals("b")){
			System.out.println("A troll turns the corner and sees you. He quickly bashes your skull. You are dead. Game Over!");
			break;
			} else
				System.out.println("Error Pick a or b");
			break;
		} 
		
	}

}
