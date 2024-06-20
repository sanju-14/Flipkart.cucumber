package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTxtFile {

	
	  public static void main(String[] args) 
	                        throws FileNotFoundException 
	  { 
	    File file = new File("C:\\Users\\SANJAY GOND\\OneDrive\\Desktop\\java.txt"); 
	    Scanner sc = new Scanner(file); 
	  
	    // we just need to use \\Z as delimiter 
	    sc.useDelimiter("\\z"); 
	  
	    System.out.println(sc.next()); 
	  } 
	} 


