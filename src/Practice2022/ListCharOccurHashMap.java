package Practice2022;

import java.util.ArrayList;
import java.util.HashMap;

public class ListCharOccurHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList();
		al.add("Bhutan");
		al.add("China");
		al.add("Srilanka");
		al.add("India");
		al.add("India");
		al.add("China");
		al.add("India");
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
			for (int i = 0; i < al.size(); i++) {
				
				if (hm.containsKey(al.get(i))) {
					
				int count = hm.get(al.get(i));
				
				hm.put(al.get(i), ++count);
					
				}else {
					
					hm.put(al.get(i), 1);
				}			
			}
			System.out.println(hm);

	}

}
