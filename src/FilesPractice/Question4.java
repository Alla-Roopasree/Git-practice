package FilesPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {

//	public Object num;
	public int n=18;

	public Question4(int num) {
		// TODO Auto-generated constructor stub
	}

	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\Samplefile.txt");
		
		Scanner sc = new Scanner(file);
		int c=0;
		while(sc.hasNext())
		{
			sc.next();
			c++;
		}
		System.out.println(c+" no of words are present");
		sc.close();
	}

	public void method1() {
		// TODO Auto-generated method stub
		
	}
	

}
