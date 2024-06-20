package package1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args)  {
		
		File file=new File("C:\\Users\\SANJAY GOND\\OneDrive\\Desktop\\java.txt");
		try {
			FileWriter fw=new FileWriter(file);
				fw.write("Hello Sanjay You are Genius");
				fw.close();
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("Successs");
	}

}
