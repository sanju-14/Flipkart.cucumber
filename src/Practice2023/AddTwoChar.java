package Practice2023;

import java.util.HashSet;

public class AddTwoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s1="1,2,3,3,1,2,4,4";
		String s = s1.replaceAll(",", "");
		int sum=0;
		int num=0;
		//System.out.println(s);
		
		HashSet<Character> hs=new HashSet<Character>();
		
		for (int i = 0; i <s.length(); i++) {
						
			hs.add(s.charAt(i));
		}
		
		for (Character ch : hs) {
			
		//System.out.print(ch);
		
		String st = ch.toString();
		//System.out.println(st);
		num=Integer.parseInt(st);		
		//System.out.println(num);
		
		while (num>0) {
			
			int value = num%10;		
			sum=sum+value;			
			 num=num/10;
		}
		
		
		}
		
		System.out.println(sum);
		
		
	}
	
}
