package hitesh;

public class Fibbonaci {

	
		public static void main(String[] args) {
							// 0 1 
			int a=0;
			int b =1;
			int c;
			
			for (int i = 0; i <=10; i++) {
				
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		
		}
}
