
package bfarias;
import java.util.Scanner;
public class CoinMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Coin Machine - B. Farias \n");
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount: ");
		float amount = input.nextFloat();
		
		System.out.println("Enter given: ");
		float given = input.nextFloat();
		float total = given - amount;
		
		int remainingAmount = (int) (total* 100);
		
		int numbOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numbOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		int numbOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numbOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numbOfPennies = remainingAmount;
		
		System.out.println("The product costs " + amount + " and the amount given is " + given + " So your change is: \n" + "\t" + numbOfOneDollars + " dollars\n" + "\t" + numbOfQuarters + " quarters\n" + "\t" + numbOfDimes + " dimes\n" + "\t" + numbOfNickels + " nickels\n" + "\t" + numbOfPennies + " pennies");
		
		
		

		 

		
		
		
	}

}
