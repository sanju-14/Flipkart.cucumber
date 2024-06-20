package Practice2023;

public class FirstCharUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="punit babu bhardwaj";
		
		// Punit Babu Bhardwaj
		
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			
		char ch = str[i].charAt(0); // String - char
			
		String sh = String.valueOf(ch).toUpperCase();
		
		String sh2 = str[i].substring(1);
		
		String fin = sh+sh2;
		System.out.print(fin+" ");
	
		}
	
	
	}

}
