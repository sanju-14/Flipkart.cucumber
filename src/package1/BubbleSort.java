package package1;

public class BubbleSort {

	public static void main(String[] args) {
			
		int a[]={36,25,5,2,8,96,45,12};
		int temp;
		
		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				
				if (a[j]>a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
			
		}
		
	}

}
