package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) throws FileNotFoundException {
		
		// TODO Auto-generated method stub
//		FileReaderClass FRC = new FileReaderClass();
		File file= new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\Samplefile.txt");
		if(!(file.exists()));

		Scanner sc = new Scanner(file);
		//read line by line or word by word
		//hasNext();
		//hasNextLine();
		//next()
		//nextLine()
		String text="";
		String line ="";
		
		while(sc.hasNextLine())
		{ line =sc.nextLine();
			System.out.print(line);
			System.out.println("\n");
			
			text+=line+"\n";
		}
//		System.out.println("\n");
		System.out.print(text);
		sc.close();

	}

}
