package Practice2023;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="mom";
		
		
		String rev="";
		
		for (int i=s.length()-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
			
		}
		
		if (s.equalsIgnoreCase(rev)) {
			
			System.out.println("string is pallindrome");
			
		} else {
			System.out.println("string is not pallindrome");
		}
		

	}

}
