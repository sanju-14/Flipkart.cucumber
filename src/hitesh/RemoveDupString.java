package hitesh;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupString {
	
	public static void main(String[] args) {
		
		
		String s= "aabsgjdsfaabcccdgjhikfj";
		
		HashSet hs=new LinkedHashSet();
		
		for (int i = 0; i <s.length(); i++) {
			
			hs.add(s.charAt(i));
			
		}
		
		System.out.println(hs);
		
	}
	


	
		
}
