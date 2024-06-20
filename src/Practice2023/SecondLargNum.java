package Practice2023;

public class SecondLargNum {
	
	public static void main(String[] args) {
		
		int[] a= {10,20,24,50,40,60}; // 60,50,40,24,20,10
		
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]>a[j]) 
				{
					
					temp=a[i]; 
					a[i]=a[j]; 
					a[j]=temp;  //a={10 20 24 40 50 60}
					
				}
				
			}
			
		}
		
		System.out.println(a[a.length-2]);
	}

}
