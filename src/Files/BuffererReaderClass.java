package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffererReaderClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\Samplefile.txt");
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
//		BufferedReader BfReader = new BufferedReader(new FileReader(file)); 
		BufferedReader BfReader = new BufferedReader(isr); 
		//we can read character by character and line by line 
		
//		BfReader.read();// read Asccichar
		
//		int acsccicode;
//		String text="";
//		while((acsccicode=BfReader.read())!=-1)
//		{
//			System.out.print((char)acsccicode);
//		}
		String line="";
		while((line=BfReader.readLine())!=null)
		{
			System.out.print(line);
			System.out.print("\n");
		}
		
		isr.close();
		
//		BfReader.readLine();
		BfReader.close();
		
//		BfReader.flush();
	}

}
