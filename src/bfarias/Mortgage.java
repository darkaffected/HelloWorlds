package bfarias;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n=360; //in months
		double i=0.0375/12; //interest
		double Pv=225000; //total amount of mortgage
		double y=n/12; //in years
		
		
		
		double Pmt=(i*Pv)/(1-Math.pow(1+i, -n));
		
		
		
		System.out.println("Mortgage Calculator - B. Farias\n");
		System.out.print("Present Value: "); 
		System.out.println(Pv);
		System.out.print("Term (years): ");
		System.out.println(y);
		System.out.print("Term (months): ");
		System.out.println(n);
		System.out.print("Rate: ");
		System.out.println(i);
		System.out.print("Payment: ");
		
		System.out.print("$");
		System.out.println(Pmt);
	}

}
