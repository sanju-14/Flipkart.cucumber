package Practice2022;

public class SwapTwoNumbers {
	
	public static void main(String args[]) {
		
		
		int a = 123;
		int b = 456;
		System.out.println("Before Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a = a+b;
		b= a-b;
		a=a-b;
		
		System.out.println("After Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
