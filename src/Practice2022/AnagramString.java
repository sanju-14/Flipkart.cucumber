package Practice2022;

import java.util.Arrays;

public class AnagramString {
	
	public static void main(String[] args) {
		
		String s1 = "Listen ees";
		String s2 = "SILENT  see";
		
		String str1 = s1.replaceAll(" ", "");
		String str2 = s2.replaceAll(" ", "");
				
			if (str1.length()!=str2.length()) {
				
				System.out.println("Strings are not Anagram");
			}else {
									
			char[] c1 = str1.toLowerCase().toCharArray();
			char[] c2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			Boolean result = Arrays.equals(c1, c2);
			
			if (result==true) 
			{
				
				System.out.println("Strings are Anagram");
				
			} else {
				
				System.out.println("Strings are not Anagram");

			}
													
			}
	}

}
