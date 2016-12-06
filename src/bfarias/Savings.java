
package bfarias;
import java.util.Scanner;
public class Savings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner keyboard = new Scanner (System.in); 
		
		//FV = PV x (1+i)^n
				
		//n = term of months 
		//i = monthly interest rate
		//PV = initial savings amount 
		
		System.out.println("Simple Interest - B. Farias\n");
		System.out.print("What is the initial savings amount? ");
		double PV = keyboard.nextDouble();
		System.out.println();
		System.out.print("What is the number of months to save? "); 
		int n = keyboard.nextInt();
		System.out.println();
		System.out.print("What is the annual interest rate? ");
		double i = keyboard.nextDouble();		
		System.out.println();
		
		double FV = PV*Math.pow((1+i), 2.0);

		System.out.println(PV + (", is saved for ") + n + (" months at ") + i + (" will be valued at " + FV));
		
		
		

	}

}
