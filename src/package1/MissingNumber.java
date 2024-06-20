package package1;

public class MissingNumber {

	public static void main(String[] args) {
			
		int a[]={8, 2, 3, 4, 5};
		int b[]={2, 3, 1, 4, 5};
		int temp=0;
		
			for (int i = 0; i <a.length; i++)
			{
					for (int j = 0; j < b.length; j++) 
					{
						if (a[i]!=b[j]) 
						{
							temp=a[i];
						}
					
					}	
			}
		System.out.println(temp);
	}

}
