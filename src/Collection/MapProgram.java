package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Map<String, Integer> hm=new HashMap<String, Integer>();
		
				hm.put("Hitesh", 19);
				hm.put("", 35);
				hm.put("Sanjay", 35);
				hm.put("punit",  35);
				hm.put("Hitesh", 20);			
				hm.put("", 35);
				hm.put("Manoj",null);
				hm.put("Rajesh",null);
				hm.put("Chandan",null);
				
				System.out.println(hm);	
	}

}
