package Practice2023;

public class FindDupEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="abcsfdgekrufbtshabcdg";
		
		for (int i = 0; i <s.length(); i++) {
			
			for (int j =i+1; j <s.length(); j++) {
				
				if (s.charAt(i)==s.charAt(j) && i!=j) {
					
					System.out.println(s.charAt(j));
					
				}
				
			}
			
		}

	}

}
