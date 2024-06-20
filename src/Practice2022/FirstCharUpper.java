package Practice2022;

public class FirstCharUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am going to school";
		
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			
			char s1 = str[i].charAt(0);
			
		String st1 = String.valueOf(s1).toUpperCase();
		
		String st2 = str[i].substring(1);
		
			System.out.print(st1+st2 +" ");
		}		

	}

}
