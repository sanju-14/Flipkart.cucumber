package Practice2022;

import java.util.HashSet;

public class RemoveDupCharInString {
	
	public static void main(String[] args) {
		
		String s = "abcdefghijklabcdefjklmnopqrstuvstuv";
		char x[] = s.toCharArray();
		
		HashSet<Character> hs=new HashSet<>();
		
		for (int i = 0; i<s.length(); i++) {
			
			hs.add(x[i]);
			
		}		
		for (Character c : hs) {
			System.out.print(c);
			
		}
		
		
	}

}
