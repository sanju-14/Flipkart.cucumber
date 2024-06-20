package Practice2022;

public class RemoveSpecialChar {
	
	public static void main(String[] args) {
		
		String s = "!#$Sanjay.Computer.@$^*Java.Portal!!";
		
		String str = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
	}

}
