package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RetrieveArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List lt=new ArrayList();
		
		lt.add("Punit");
		lt.add("");
		lt.add("hitesh");
		lt.add("Sanjay");
		lt.add("hitesh");
		lt.add("");
		lt.add(123);  
		lt.add(24.568); 
		lt.add(true); 
		
		//System.out.println(lt);
		
		
		for (int i = 0; i < lt.size(); i++) { // Using for loop
		
			//System.out.println(lt.get(i));
		}
				
		for (Object object : lt) {  // Using for each loop
			
			//System.out.println(object);
			
		}
		
		Iterator it = lt.iterator(); // Using iterator Interface

		while (it.hasNext()) {
			Object value = it.next();
			
			//System.out.println(value);
			
		}
		
		ListIterator It1 = lt.listIterator(); // Using listIterator Interface
			while (It1.hasNext()) {
				Object Listvalue = It1.next();
				
				System.out.println(Listvalue);
				
	}

}
}