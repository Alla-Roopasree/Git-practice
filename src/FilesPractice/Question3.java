package FilesPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text : ");
			String str=sc.next();
			File file = new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\Samplefile.txt");
			
			Scanner sc1 = new Scanner(file);
			String word="";
			int c=0;
			while(sc1.hasNext())
			{
				word=sc1.next();
				if(word.equals(str))
					c++;
			}
			if(c==0)
				System.out.println(str+" is not present in file");
			else
				System.out.println(str+" is occured "+c+" times");
	}

}
