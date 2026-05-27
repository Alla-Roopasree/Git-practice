package ListPractice;

import java.util.Scanner;
import java.util.Stack;

public class Stackparathesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Character> stk = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter parthesis string : ");
		String str=sc.next();
		boolean flag= true;
		for(char c: str.toCharArray())
		{
			if(c=='['||c=='{'||c=='(')
			{
				stk.push(c);
			}
			else
			{
				switch(c)
				{
					case ']':
						if(stk.peek() =='[')
						{
							stk.pop();
						}
						else {
							flag=false;
						}
						break;
					case '}':
						if(stk.peek() =='{')
						{
							stk.pop();
						}
						else
							flag=false;
						break;
					case ')':
						if(stk.peek() =='(')
						{
							stk.pop();
						}
						else
							flag=false;
						break;
				}
			}
			
		}
		if(flag==true)
			System.out.println("valid");
		else
			System.out.println("Invalid");
		
		
	}

}
