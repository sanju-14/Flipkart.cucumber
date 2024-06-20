package Practice2022;

import java.util.Arrays;

public class ArrayInbuilt {
	
		public static void main(String[] args) {
			
			int[] a= {4,2,8,5,1,3,10,12,11,20,15};
			
			String s = Arrays.toString(a);
			
			System.out.println("Array elements before sorting "+s);
			
			Arrays.parallelSort(a);
			String s2 = Arrays.toString(a);
			
			System.out.println("Array elements after sorting "+s2);
			
				
		}
	
		
	
}
