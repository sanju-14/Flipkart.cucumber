package package1;

import java.util.Scanner;

public class SwapWithoutVar {

	public static void main(String[] args) {			
			int a, b;
				System.out.println("Enter two numbers");
				Scanner in=new Scanner(System.in);
				
						a=in.nextInt();
						b=in.nextInt();
						a=a+b;
						b=a-b;
						a=a-b;
						
						System.out.println("Value of a =  " +a);
						System.out.println("Value of b =  " +b);
						
	}

}
