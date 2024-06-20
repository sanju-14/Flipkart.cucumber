package Practice2023;

public class RemoveSpecialChar {
	
	public static void main(String[] args) {
		
		String s = "!@#Hitesh$Punit.@*" ;
		
		String st =s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(st); //punit- replace hoga // hitesh -  
		
		
	}
	
	
}
