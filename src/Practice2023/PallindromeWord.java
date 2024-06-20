package Practice2023;

public class PallindromeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="geeks for geeks";
		
		String Reverse="";
		
		String[] str = s.split(" ");
		
		for (int i =str.length-1; i>=0; i--) {
			
			Reverse=Reverse+str[i]+" ";		
			
		}		
			Reverse = Reverse.trim();
			
		if (Reverse.equalsIgnoreCase(s)) {
			
			System.out.println("Pallindrome");
			
		} else {
			System.out.println("Not Pallindrome");
		}
		
	
	}
	
	

}
