package Files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
	static File file ;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		file= new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\Samplefile.txt");
		FileReader reader = new FileReader(file);
		int asscicode;
		String text = "";
		
		while((asscicode = reader.read())!=-1)
		{
			System.out.print((char)asscicode);
			
			text+=String.valueOf((char)asscicode);
		}
		System.out.println("\n");
		System.out.println(text);
		
		reader.close();
		
	}

}
