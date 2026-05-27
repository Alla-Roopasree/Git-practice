package FilesPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question6 {

	public static void main(String args[]) throws IOException
	{
		File file= new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\Sample3.txt");

		FileInputStream fis = new FileInputStream(new File(""));
		int acsii;
		String word="";
		while((acsii=fis.read())!=-1)
		{
			word+=String.valueOf((char)acsii);
			
		}
		String words=word.toUpperCase();
		
		fis.close();
		FileOutputStream fos = new FileOutputStream(file);
		for(char ch:words.toCharArray())
		{
			fos.write((int)ch);
		}
		fos.close();
		fos.flush();
	}
}
