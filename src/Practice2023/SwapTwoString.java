package Practice2023;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Sanjay"; //a
		
		String s2="Punit";  //b
		
		//a=a+b
		//b=a-b
		//a=a-b
		
			s1=s1+s2; //SanjayPunit
			
			s2=s1.substring(0, 6); //Sanjay			
			s1=s1.substring(6);  //Punit
			
			System.out.println("s1 "+s1);
			System.out.println("s2 " +s2);
		
		

	}

}
