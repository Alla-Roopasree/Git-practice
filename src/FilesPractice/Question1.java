package FilesPractice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.out.println("no of lines : ");
	File f1 = new File("C:\\\\Users\\\\2153786\\\\OneDrive - Cognizant\\\\Desktop\\\\SeleniumWithjava\\\\Core Java\\\\Samplefile.txt");
//	if(!f1.exists())
//	{
//		f1.createNewFile();
//	}
	Scanner sc =new Scanner(f1);
	int c=0;
	while(sc.hasNextLine())
	{String line = sc.nextLine();
		c++;
		
	}
	System.out.println("no of lines : "+c);
	sc.close();
	
	}

}
