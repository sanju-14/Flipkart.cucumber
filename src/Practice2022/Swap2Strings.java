package Practice2022;

public class Swap2Strings {
	
	
	public static void main(String args[]) {
		
		String s1 = "Sanjay";
		String s2 = "Dheeraj";
//		String s="";
//		
//		s=s1;
//		s1=s2;
//		s2=s;
//		
//		System.out.println(s1);
//		System.out.println(s2);
				
		// Combine both the strings s1 and s2 using the concatenation(+) operator
		s1 = s1 + s2;

		// Use the substring method to get the subset of the combined string
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("s1 =" + s1);
		System.out.println("s2 =" + s2);
		
							
	}

}
