package Practice2022;

import java.util.HashSet;

public class StringProb1 {
	
	public static void main(String[] args) {
		
		// input = aabbbccccddeeef
		// output = a2b3c4d2e3f
				
		String s = "aabbbccccddeeef";
		
		HashSet<Character> hs=new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		
		for (Character str : hs) {
			
			int count=0;
			
		for (int i = 0; i<s.length(); i++) {
				
				
				if (str==s.charAt(i)) {
					
					count++;															
				} 				
			}
		
		System.out.print(str.toString() + count);
		//System.out.println(str.toString()+ " ->" + count);
			
		}							
					
	}

}
