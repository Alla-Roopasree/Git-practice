package ListPractice;

import java.util.Vector;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//prime number using list
		boolean flag;
		Vector<Integer> v= new Vector<Integer>();
		System.out.println(v);
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag)
				v.add(i);
		}
		System.out.println(v);
		
		
		
	}

}
