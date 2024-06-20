package package1;

public class DupElements { // Brute Force Method

	public static void main(String[] args) {
			
		System.out.println("Duplicate Elements are :");
		
		int a[] ={4,5,7,9,58,7,2,5,8,9,6,12,56};
		
		for (int i = 0; i <a.length; i++) {
			
			for (int j =i+1; j < a.length; j++) {
				
				if (a[i]==a[j] && i!=j) {
						
					System.out.println(a[j]);
				}
				
			}
			
		}
	}

}
