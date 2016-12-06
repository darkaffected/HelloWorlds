package bfarias;
import java.util.*;
public class BrandName {

	static Random r = new Random();
	static String vowels = "aeiou";
	static String cons = "qwrtpsdfghjklzxcvbnm";
	
	public static void main(String[] args) {
		System.out.println("Brand Name Generator - B.Farias\n");
		
		for (int z= 1; z<=10; z ++) {
			String name = "";
			int length = r.nextInt(7)+6;
		
		
		for (int j = 1; j <= length; j ++){
			if (j ==1){
			
			name = name + Character.toUpperCase(consCreator());
			}
		
		else if (j%2 ==1){
			name = name + consCreator();
		}
		else {
			name = name + vowelCreator();
		}
		}
		System.out.println(name);
		}
	}	
		
		private static char consCreator() {
			return cons.charAt(r.nextInt(19));
			
		}
		
		private static char vowelCreator() {
			return vowels.charAt(r.nextInt(5));
		}
	}
		
		
		
			
		
		
		