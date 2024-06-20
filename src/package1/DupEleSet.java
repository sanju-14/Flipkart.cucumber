package package1;

import java.util.HashSet;
import java.util.Set;

public class DupEleSet {

	public static void main(String[] args) {
		
		int a[]={4,5,7,9,58,7,2,5,8,9,6,12,56};
		
		 Set<Integer> s=new HashSet<>();
		 
		 for (Integer no : a) {
			 	if (s.add(no)==false) {
			 		System.out.println(no);
				}
			 
		}
	}			
	
	

}
