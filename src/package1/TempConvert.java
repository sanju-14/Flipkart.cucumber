package package1;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		float c,f;
		
		System.out.println("Enter Temperature in celsius");
		Scanner in=new Scanner(System.in);
		
					c=in.nextFloat();
					
					f= c*(9f/5)+32;
					
					System.out.println(f + "  degree temperature in farenheit");
	}

}
