package hitesh;

public class FirstCharCapital {

	public static void main(String[] args) {
		
		
		String s = "i am going to school"; // I Am Going To School
		
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			
				char ch = str[i].toUpperCase().charAt(0); // I A G T S
									
				String ch2 = str[i].substring(1); // m oing o chool
				
				
				System.out.print(ch + ch2 + " ");
					
					
			
		}
		
		
		
	}
}
