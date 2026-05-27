package FilesPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\Sample file.txt");
		File f2= new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\Samplefile.txt");
		File f3 = new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\Sample3.txt");
		f3.createNewFile();
		FileInputStream fis = new FileInputStream(f1);
		FileInputStream fis2 = new FileInputStream(f2);
		FileOutputStream fis3 = new FileOutputStream(f3);
		int asciicode;
		String text="",text2="";
		while((asciicode=fis.read())!=-1)
		{
			text+= String.valueOf((char)asciicode);
		}
		text+="\n";
		while((asciicode=fis2.read())!=-1)
		{
			text+= String.valueOf((char)asciicode);
		}
		
		for(char ch:text.toCharArray())
		{
			fis3.write((int)ch);
		}
		
	}

}
