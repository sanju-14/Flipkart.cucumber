package Practice2022;

public class FindDupInString {
	
	public static void main(String[] args) {
		
		String s = "abcdefghiabcdef";
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i+1; j < s.length(); j++) {
				
				if (ch[i]==ch[j] && i!=j) {
					
				System.out.print(ch[j]);

				}
				
			}
			
		}			
			
	}

}
