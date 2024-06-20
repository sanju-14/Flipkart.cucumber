package Practice2022;

public class AmstrongNum {
	
	public static void main(String[] args) {
		
		int num = 153;
		// Amstrong num - 1*1*1 + 5*5*5 +3*3*3 , 1+125+27 = 153
		
		int actnum=num;
		double result=0;
		
		while (actnum!=0) {
				
			int n=actnum%10;
			result=result+Math.pow(n, 3);
			actnum=actnum/10;
		}
		
		if (result==num) {
			
			System.out.println(num + " is an amstrong number");
			
		} else {
			
			System.out.println(num + " is not an amstrong number");
		}
		
	}

}
