package ListPractice;

import java.util.Stack;
import java.util.Vector;

public class Question13 {

	public static void main(String[] args)
	{
		Stack<Integer> sc = new Stack<>();
		sc.push(1);
		sc.push(8);
		sc.push(0);
		sc.push(5);
		sc.push(1);
		sc.push(6);
		int ele;
		Vector<Integer> v= new Vector<Integer>();
		
			while(!sc.empty())
			{
				v.add(sc.pop());
			}
		
		System.out.println(v);
	}
	
}
