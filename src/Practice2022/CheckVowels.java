package Practice2022;

import java.util.Iterator;

public class CheckVowels {
	
	public static void main(String[] args) {
		
		String str= "Welcome To NEW WORLD";
		String s = str.toLowerCase();
		
		for (int j = 0; j<s.length(); j++) {
			
			if (s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
			{
				System.out.println("vowels are " + s.charAt(j));
			} 
			
		}
			
		
	}

}
