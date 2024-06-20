package Practice2022;

public class ReverseWord {

	
	public static void main(String[] args) {
		
		String s1="My name is Sanjay Kumar Gond";
			String[] s = s1.split(" ");
			//String[] s = s1.split("");    // use for reverse each character
			String rev="";
			
			for (int i =s.length-1; i>=0; i--) {
				
				rev=rev+s[i];
			}
		System.out.println(rev);
	}
	
	
}
