package bfarias;

public class DieDriver {

	public static void main(String[] args) {
		
		System.out.println("Die Driver - B.Farias\n");
		System.out.println("1. Creation of Die");
		Die d1 = new Die();
		Die d2 = new Die(4);
		Die d3 = new Die(10);
		d1.setValue(6);
		d2.setValue(4);
		d3.setValue(10);
		d1.print();
		d2.print();
		d3.print();
		System.out.println("\n");
		
		System.out.println("2. Setting Value of Die");
		d1.setValue(3);
		d1.print();
		d2.setValue(5);
		d2.print();
		d3.setValue(0);
		d3.print();
		System.out.println("\n");
		
		System.out.println("3. Freezing a Die");
		d1.freeze();
		d1.setValue(5);
		d1.print();
		d1.unfreeze();
		d1.setValue(5);
		d1.print();
		System.out.println("\n");
		
		System.out.println("4. Drawing a Die");
		d1.draw();
		d2.draw();
		d3.draw();
		System.out.println("\n");
		
		System.out.println("5. Test a rolling Die");
		for(int i = 1; i <= 3;i++) {
			d2.roll();
			d3.print();
		}
		
		//System.out.println(d2.getValue());
	}

}
