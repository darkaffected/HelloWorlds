package bfarias;
import java.util.*;
public class DaysOfYear {

	public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        
        //            0   1   2   3   4   5   6   7   8   9   10  11
        int[] days = {31, 28, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
        int[] daysLeap = {31, 29, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};
        
        System.out.println("Calendar Counter - B. Farias\n");
        System.out.println("Do you want a leap year? y/n" );
        String choice = input.next();
        
        if(!choice.equalsIgnoreCase("y")){
            printMonths(days);
        }else{
            printMonths(daysLeap);
        }
    }
    
    public static void printMonths(int[] days){
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < days[i - 1] + 1; j++) {
                System.out.print(i + "/" + j + " ");
            }
            System.out.println();
        }
    }
}