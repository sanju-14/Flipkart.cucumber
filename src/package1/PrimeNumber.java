package package1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		int temp=0;
		System.out.println("Enter Any Integer Number");
		Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			
				for (int i = 2; i <num-1; i++)
				{
					if (num%i==0)
					{	
							temp=temp+1;
					}
				}
				if (temp==0) {
					
					System.out.println(num+" is Prime Number");
				}
				else{
					System.out.println(num+" is not Prime Number");
				}
	
			}
	
			
	}

