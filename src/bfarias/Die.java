package bfarias;
import java.util.Random;
public class Die {

	private Random random = new Random();
	private int numSides;
	private int val;
	private boolean frozen;
	
	public Die(int numSides) {
		this.numSides = numSides;
		this.val = 1;
		
	}
	
	public Die() {
		
		this.numSides = 6;
		this.val = 1;
		
	}
	public void setValue(int v) {
		
		
		if(frozen == false){
			if ( 0 < v && v <= numSides) {
				this.val = v;
			}
			else{
				System.out.println("**Attempted to set value to " + v + ", assumed 1.");
				this.val = 1;
			}
		}
		
	}
	public int getValue() {
		return this.val;
		
	}
	public void roll() {
		if (frozen == false) {
			val = random.nextInt(numSides)+1;}
	}
	
	public void print () {
		System.out.println("[" + val + ":" + numSides + "] ");
	}
	

	public void draw() {
		if (numSides > 6) {
			print();
			
		}else {
			System.out.println(".......");
			System.out.println(".     .");
			//top of dice
			if (val == 1) {
				System.out.println(".     .");
				
			}else if (val == 2 || val == 3) {
				System.out.println(".*     .");
				
			}else{
				System.out.println(". * * .");
				
			}
			//middle of die
			if (val % 2 == 1) {
				System.out.println(".  *  .");
			}else if (val == 6){
				System.out.println(". * * .");
			}else{
				System.out.println(".     .");
			}
			//bottom die
			if (val == 1) {
				System.out.println(".     .");
			}else if (val == 2 || val == 3) {
				System.out.println(".    *.");
			}else{
				System.out.println(". * * .");
			}
			System.out.println(".     .");
			System.out.println(".......");
		}
	}
	
	public void freeze() {
		frozen = true;
	}
	
	public void unfreeze() { frozen = false; }
	
	
	
	
	
	
	
	/*public void numSides(int z) {
		size = z;
	}
	
	public int numSides() {
		return size;
	}
	
	public void downsize() {
		size--;
	}
	
	public void Die(int numSides) {
		if ( sides > 1 ) {
			System.println("["+ v + ":" + sides + "]");
		}else if ( sides <= 1);
			System.println("Error!!!!!!!")
		
	}
	
	/*Public void numSides (int x) {
		
		numSides = x;
		
	}
	Public Die () {
		numSides = 6;
	}
	
	/*private int sides;
	private String pickSides;
	*/
	
}
