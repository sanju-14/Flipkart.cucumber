package hitesh;

import java.util.HashMap;

public class CharOccurIntArray {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,4,5,8,7,6,2,1,5,8,10};
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			if (hm.containsKey(a[i])) {
				
				int	count=hm.get(a[i]);
				
				hm.put(a[i], ++count);
				
				
			} else {
				
				hm.put(a[i], 1);

			}
			
		}
		System.out.println(hm);
		
	}

}
