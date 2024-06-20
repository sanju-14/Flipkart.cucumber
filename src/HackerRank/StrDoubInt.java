package HackerRank;

import java.util.Scanner;

public class StrDoubInt {
	
public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	 System.out.println("Enter Input");
    	 
    	 String s = scan.nextLine();
    	 int i = scan.nextInt();       
         Double d = scan.nextDouble();
         
         
         System.out.println("String: " + s);
         System.out.println("Double: " + d);
         System.out.println("Int: " + i);
    }

}

//Input
//42
//3.1415
//Welcome to HackerRank's Java tutorials!

//Output
//Welcome to HackerRank's Java tutorials!
//3.1415
//42
