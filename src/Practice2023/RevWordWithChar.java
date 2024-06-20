package Practice2023;

public class RevWordWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "my name is punit";
		
		String[] str = s.split(" ");
		
		String rev="";
		
		for (int i = 0; i < str.length; i++) {
			
			String word=str[i];
			
			String Revword="";
			
			for (int j =word.length()-1; j>=0; j--) {
				
				Revword=Revword+word.charAt(j);
			}
			
			rev=rev+Revword+" ";
			
		}
		
		System.out.println(rev);
		

	}

}
