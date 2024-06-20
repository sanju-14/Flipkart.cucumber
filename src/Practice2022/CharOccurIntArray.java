package Practice2022;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class CharOccurIntArray {
	
	public static void main(String[] args) {
		
		int[] a={22,1,5,8,4,20,7,9,3,2,4,5,1,5,21,7,8};
					
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			if (hm.containsKey(a[i])) {
				
				int count = hm.get(a[i]);
				
				hm.put(a[i], ++count);
				
			} else {
				
				hm.put(a[i], 1);
			}			
		}
		System.out.println(hm);		
																				
		}		
}
