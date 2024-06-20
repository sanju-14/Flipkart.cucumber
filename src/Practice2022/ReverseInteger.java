package Practice2022;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num=4568;
		
		int rev=0;
		
		while (num!=0) {
			
			rev=rev*10 + num%10; // 0*10 + 8 = 8, 8*10 + 6 =86, 860+5 = , 8650+4 =8654
			num=num/10;
			
		}		
		
		System.out.println(rev);
		

	}

	
}
