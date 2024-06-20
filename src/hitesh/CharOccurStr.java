package hitesh;

import java.util.HashSet;

public class CharOccurStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "aabsgjdsfaabcccdgjhikfj";
		
		HashSet<Character> hs=new HashSet();
		
		for (int i = 0; i <s.length(); i++) {
			
			hs.add(s.charAt(i));
			
		}
		
		for (Character c : hs) {
			
			int count=0;
			
			for (int i = 0; i <s.length(); i++) {
				
				if (c==s.charAt(i)) {
					
					count++;					
				} 
				
			}
			
			if (count>1) {
					
				System.out.println(c.toString()+" -->" + count);
			} else {
				
				
				System.out.println(c.toString()+" -->" + 1);
			}
			
		}		
	}
}
