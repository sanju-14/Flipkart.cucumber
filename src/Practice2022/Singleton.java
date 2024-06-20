package Practice2022;

 class Antivirus {
	
	
		static Antivirus a1=new Antivirus(); //make static object  
				
		private Antivirus() {   //make private constructor
			
			
			//System.out.println("private constructor");
			
		}
		
		public static Antivirus getAntivirusinstance() // make static method and return same class
		
		{ 
			//Antivirus a1=new Antivirus();
			
			return a1;
								
		}
}
			
public class Singleton {
			
public static void main(String[] args) {
	
		
		System.out.println(Antivirus.getAntivirusinstance());
		System.out.println(Antivirus.getAntivirusinstance());
		System.out.println(Antivirus.getAntivirusinstance());
				

	}
	
	
}
	
	
	
	

	


