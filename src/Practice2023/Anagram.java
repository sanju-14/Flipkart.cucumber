package Practice2023;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String s1 ="Listen eas";
		String s2 = "Silent See";
		
		String str1 = s1.replaceAll(" ", "");
		String str2 = s2.replaceAll(" ", "");
		
		if (str1.length()!=str2.length()) {
			
			System.out.println("Strings are not anagram");
			
		} else {
			
			char[] ch1 = str1.toLowerCase().toCharArray();	// listenees // 2358// 
			char[] ch2 = str2.toLowerCase().toCharArray();
			
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				
			boolean temp = Arrays.equals(ch1, ch2);
			
			if (temp) {
				System.out.println("Strings are anagram");
				
			} else {
				System.out.println("Strings are not anagram");
			}
				

		}
		

	}

}
