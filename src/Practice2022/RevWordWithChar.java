package Practice2022;

public class RevWordWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "my name is mayank";
		
		//output = ym eman si knayam

		String[] str=s.split(" ");			
			
		String rev="";


		for(int i=0; i<str.length; i++){
			
			String word=str[i]; //str[0]=my, str[1]=name
			
			String revword="";
			
			for (int j = word.length()-1; j >=0 ; j--) {
											
				revword=revword+word.charAt(j);
			}
			
			rev=rev+revword+" ";
			
		}

		System.out.println(rev);
							
	}

}
