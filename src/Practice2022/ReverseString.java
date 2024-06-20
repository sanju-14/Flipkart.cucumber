package Practice2022;

import java.util.Iterator;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "sanjaykumar";
		
		String reverse = "";
		
		for (int i = s.length()-1; i>=0; i--) {
			
			reverse = reverse+s.charAt(i);			
			
		}		
		System.out.println(reverse);	
		
	}
	
	
	
	

}
