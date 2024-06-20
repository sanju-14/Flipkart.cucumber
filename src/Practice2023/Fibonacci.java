package Practice2023;

public class Fibonacci {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		int c;
		for (int i = 0; i<15; i++) {
			
			c=a+b;	
			
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
