package package1;

import java.util.Scanner;

public class SwapWithVar {

	public static void main(String[] args) {
			
		int a, b,c;
			System.out.println("Enter two numbers");
			Scanner in=new Scanner(System.in);
			
					a=in.nextInt();
					b=in.nextInt();
					c=a;
					a=b;
					b=c;
					
					System.out.println("Value of a =  " +a);
					System.out.println("Value of b =  " +b);
					
	}

}
