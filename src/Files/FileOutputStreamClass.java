package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file = new File("./sample.txt");
		if(file.exists())
		{
			file.delete();
		}
		file.createNewFile();
		FileOutputStream output = new FileOutputStream(file);
		//we have to pass ASCCI code
//		output.write(34);
//		output.write(56);
//		output.write(67);
//		output.write(74);
//		output.write(75);
		
		
		//if we have text convert to asscii code
		String text = "Hello Roopa,\nI am good here, what about you\nThank you.";
	for(char ch:text.toCharArray())
	{
		output.write((int)ch);
	}
		output.close();
		output.flush();
	}

}
