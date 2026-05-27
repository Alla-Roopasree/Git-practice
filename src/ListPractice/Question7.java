package ListPractice;

import java.util.Vector;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> unique = new Vector<Integer>();
		v1.add(4);
		v1.add(1);
		v1.add(9);
		v1.add(4);
		v1.add(8);
		v1.add(0);
		v1.add(5);
		v1.add(1);
		v1.add(8);
		v1.add(6);
		for(int i:v1) {
			if(unique.contains(i) )
			{
				if(!(v2.contains(i)))
						{
					v2.add(i);
						}
			}
			else
			{
				unique.add(i);
			}
		}
		v1.removeAll(v2);
		System.out.println(v1);
	}
	

}
