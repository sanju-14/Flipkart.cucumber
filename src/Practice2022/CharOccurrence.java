package Practice2022;

import java.util.HashMap;

public class CharOccurrence {
	
	public static void main(String[] args) {
		
	      String str = "ABCSSDRRRTTYYTYTRDCB";
	      
	      HashMap <Character, Integer>  hm=new HashMap<Character, Integer>();
	      
	      for (int i = 0; i < str.length(); i++) {
	    	  
	    	  if (hm.containsKey(str.charAt(i))) {
	    		  
	    		  int count = hm.get(str.charAt(i));
	    		  
	    		  hm.put(str.charAt(i), ++count);
				
			} else {
				
				hm.put(str.charAt(i), 1);

			}
	    	  			
		}
	      System.out.println(hm);
	      
	   }

}
