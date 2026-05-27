package ListPractice;

import java.util.Vector;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<Integer>();
		v.add(4);
		v.add(9);
		v.add(8);
		v.add(5);
		v.add(0);
		v.add(10);	
		
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		
		
		
		for(int i:v)
		{
			if(v.indexOf(i)<v.size()/2)
				v1.add(i);
			else
				v2.add(i);
		}
		System.out.println("Vector1 : "+ v1+"\nVector2 : "+v2);
	}

}
