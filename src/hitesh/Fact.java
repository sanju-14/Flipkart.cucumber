package hitesh;

public class Fact {
	
	public static void main(String[] args) {
		
		int num=5;  // 1*2*3*4*5 = 120
		int fact=1;
		
		for (int i = 1; i <= num; i++) {
			
			fact=fact*i;
			
		}
		
		System.out.println(fact);
	}
}
