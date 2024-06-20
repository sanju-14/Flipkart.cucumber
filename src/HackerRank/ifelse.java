package HackerRank;

import java.util.Scanner;

public class ifelse {
	

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	 System.out.println("Enter Number");
    	 
        int N = scan.nextInt();
                           
        if ((N%2!=0) || (N>=6 && N<=20)) {
            System.out.println("Weird");
            
        } else if(N%2==0 || N>=2 && N<=5 || N>20) {
            System.out.println("Not Weird");
        }
    }
}


