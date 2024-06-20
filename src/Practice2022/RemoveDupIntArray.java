package Practice2022;

import java.util.HashSet;

public class RemoveDupIntArray {
	
	public static void main(String[] args) {
		
		int a[]={1,5,8,4,7,9,3,2,4,5,89,45,7,6,5,48,1,23,4,6,7,8,6,9,5,2,4,89,48};
		
		HashSet<Integer> hs=new HashSet<Integer>();		
		
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);					
				
			}
		
		for (Integer num : hs) {
			
			System.out.println(num);
			
		}
			
		}
		
		
	}


