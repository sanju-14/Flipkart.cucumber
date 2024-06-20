package package1;

public class ReverseString {
	
	public static void main(String[] args) {
		
			String name="454";
			int lgth = name.length();
			
			String rev="";
			
			for (int i = lgth-1; i>=0 ; i--) {
				
						rev=rev+name.charAt(i);		
						
			}
			System.out.println(rev);
			
			if (name.equals(rev)) {
				
				System.out.println("Number is pallindrome");
				
			}
			else{
				
				System.out.println("Number is not pallindrome");
			
			}
	}

}
