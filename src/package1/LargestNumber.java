package package1;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
				
		int x,y,z;
			System.out.println("Enter Three Numbers");
		Scanner in=new Scanner(System.in);
		
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		
		
		if (x>y && x>z) {
			
			System.out.println("First Number is the Largest");
			
		}
		else if (y>x && y>z) {
			System.out.println("Second Number is the Largest");
			
		}
		else if (z>x && z>y) {
			System.out.println("Third Number is the Largest");
			
		}
		else{
			System.out.println("Entered Number is not distinct");
			
		}
	}

}
