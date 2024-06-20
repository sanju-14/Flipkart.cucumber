package Practice2023;

public class BubbleSort {

public static void main(String[] args) {
		
		int[] a= {10,20,24,50,40,60,30,45,80,90,70,65,60}; 
		
		// Output in Asc a={10 20 24 30 40 45 50 60 60 65 70 80 90}
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]>a[j]) 
				{
					
					temp=a[i]; 
					a[i]=a[j]; 
					a[j]=temp;  
					
				}				
			}
			
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
		
		
		//System.out.println(a[a.length-2]);  // Second largest Number
	}

}
