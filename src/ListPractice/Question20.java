package ListPractice;

import java.net.URL;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Question20 {

	public static void main(String[] args) throws EmptyStackException {
		// TODO Auto-generated method stub

		
		Stack<String> stk = new Stack<>();
		Stack<String> temp = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String input="";
		while(!input.equalsIgnoreCase("Stop"))
		{
			input=sc.nextLine();
			
			if(!input.equalsIgnoreCase("back") && !input.equalsIgnoreCase("forward"))
			{
				stk.push(input);
				System.out.println(input.substring(6,input.length()-1));
			}
			else if(input.equalsIgnoreCase("BACK"))
			{
				try {
				temp.push(stk.pop());
				System.out.println(stk.peek());
				}
				catch(Exception e)
				{
					System.out.println("there is no previous Url");
				}
			}
			else if(input.equalsIgnoreCase("forward"))
			{
				try {
					stk.push(temp.pop());
					System.out.println(stk.peek());
				}
				catch(Exception e) {
					System.out.println("There is no next URl");
				}
			}
		}
//		String s1= "visit https://www.youtube.com/c/HYDTutorialsTelugu";
//		String s2="visit https://www.hydtutorials.com";
//		String s3="back";
//		String s4="forward";
//		
		
		
	}

}
