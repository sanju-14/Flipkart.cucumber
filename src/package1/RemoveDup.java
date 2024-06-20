package package1;

import java.util.HashSet;

public class RemoveDup {

	public static void main(String[] args) {
			
		int a[]={1,5,8,4,7,9,3,2,4,5,89,45,7,6,5,48};
		
		 HashSet<Integer> hs=new HashSet<Integer>();
		 
		 for (int i = 0; i < a.length; i++) {
			 
			 hs.add(a[i]);
			
		}
		 
		 for (Integer num : hs) {
			System.out.println(num);
		}
	}
	

}
