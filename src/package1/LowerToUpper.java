package package1;

public class LowerToUpper {

	public static void main(String[] args) {
			
			String str="sanjay kumar gond";
			
					char y[]=str.toCharArray();
					
					int size = y.length;
					
					for (int i = 0; i <=size-1; i++) {
								y[i]=(char) (y[i]-32);
					}
					
					System.out.println(y);
	}

}
