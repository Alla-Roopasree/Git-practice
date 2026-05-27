package ListPractice;

import java.util.Vector;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		Vector<Integer> v = new Vector<Integer>();
		v.add(4);
		v.add(5);
		v.add(0);
		v.add(9);
		v.add(8);
		v.add(10);
		for(int i:v)
		{ 	
			 sum += i;
//			 System.out.println("Sum : "+sum);
		}
		System.out.println("Sum : "+sum);
		System.out.println("AVG : "+sum/v.size());

	}

}
