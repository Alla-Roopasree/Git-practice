package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("./sample.txt");
		if(file.exists())
		{
			file.delete();
		}
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		//we have to pass ASCCI code
//		output.write(34);
//		output.write(56);
//		output.write(67);
//		output.write(74);
//		output.write(75);
		
		
		//if we have text convert to asscii code
		//we can write string character array or asciicode
		String text = "Hello Roopa,\nI am good here, what about you\nThank you.";
	for(char ch:text.toCharArray())
	{
		writer.write((int)ch);
	}
	writer.write(text);
	writer.close();
	writer.flush();

	}

}
