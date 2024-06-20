package Practice2022;

public class replaceChar {
		
		public String sanjay(){
	        
	        String s = "My name is Sanjay kumar";	        
	    
	        // AEIOU    // x
	        for(int i=0; i<=s.length()-1; i++)
	        {
	        
	            String str="x";
	                  
	            if('a'==s.charAt(i) || 'e'==s.charAt(i) || 'i'==s.charAt(i) || 'o'==s.charAt(i) || 'u'==s.charAt(i))
	            {
	                
//	                     char ch=s.charAt(i); // aeiaaua
//	                     ch = str.charAt(0);    
	                     
						String s1=s.replace(s.charAt(i), str.charAt(0));
	            }
	            
	        }
	        
	        return s;
	    }
	    
	    public static void main(String[] args) {
	       
	    	replaceChar rc=new replaceChar();
	     
	        System.out.println(rc.sanjay());
	        
	        }			
		

	}

