package Practice2023;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="puniitsfgiip"; // punitsfg
		//String s="1,2,2,3,1,3";
		
		HashSet<Character> hs=new HashSet();
		
		for (int i = 0; i <s.length(); i++) {
			
			hs.add(s.charAt(i));
					
		}
		
		for(Character ch : hs) {
			
			System.out.print(ch);
		}
		
	
	}

}
