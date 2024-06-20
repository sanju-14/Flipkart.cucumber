package package1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
			
		int num;
		System.out.println("Enter Any Integer Number");
		Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			
			if (num%2==0) {
				
				System.out.println("Entered number is Even Number");
			}
			else{
				
				System.out.println("Entered number is Odd Number");
			}
	}
	

}
