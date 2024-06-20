package Practice2023;

import java.util.HashMap;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am learning learning java java java code code code";
		
		String[] str=s.split(" ");
		
		HashMap<String, Integer>hm= new HashMap<String, Integer>();
		
			for (int i = 0; i < str.length; i++) {
				
				if (hm.containsKey(str[i])) {
					
					int count=hm.get(str[i]);
					
					hm.put(str[i], ++count);
				} else {
						
					hm.put(str[i], 1);
				}
				
			}
			
			System.out.println(hm);

	}

}
