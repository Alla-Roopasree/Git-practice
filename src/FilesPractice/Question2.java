package FilesPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question2 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\\\Users\\\\2153786\\\\OneDrive - Cognizant\\\\Desktop\\\\SeleniumWithjava\\\\Core Java\\\\Samplefile.txt");
		// TODO Auto-generated method stub
		
BufferedReader bf =new BufferedReader(new FileReader(file));
String line ="",Line_content="";
int max_length=0,line_No=0,c=0;

while((line =bf.readLine())!=null)
{
	c++;
	if(max_length<line.length())
	{
		max_length=line.length();
		line_No=c;
		Line_content=line;
	}
}
System.out.println("max_length : "+max_length);
System.out.println("line_No : "+line_No);
System.out.println("Line_content : "+Line_content);
bf.close();
	}

}
