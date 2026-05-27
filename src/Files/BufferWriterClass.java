package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File(".\\sample.txt");
		if(!file.exists())
			file.createNewFile();
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		String Text="";
		String content="";
		while((Text = br.readLine())!=null)
		{
			content +=Text+"\n";
		}
		bw.write(content+'H');
//		bw.write("Hi");
		bw.flush();
	}

}
