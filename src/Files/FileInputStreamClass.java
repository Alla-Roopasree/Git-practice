package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file = new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\Samplefile.txt");
//	file.createNewFile();
	FileInputStream fis = new FileInputStream(file);
	int asciicode;
	String text="";
	while((asciicode=fis.read())!=1)
	{
		text+=String.valueOf((char)asciicode);//if we directly give fis.read()
//		it will read next character so assign it to new variable
		System.out.print((char)asciicode);
	}
	System.out.print(text);
	fis.close();
	}

}
