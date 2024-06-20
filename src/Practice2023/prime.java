package Practice2023;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 47; // not a prime number
		int tem=0;
				
		for (int i = 2; i<num ; i++) {
			
			if (num%i==0) { //35/2= 0
				
				tem=tem+1;
							
			}
			
		}
		
		if (tem==0) {
			
			System.out.println(num + " prime number");
			
		} else {
			
			System.out.println(num + " Not a prime number");
		}
		
		

	}

}
