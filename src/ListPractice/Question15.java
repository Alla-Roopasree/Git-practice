package ListPractice;

import java.util.Vector;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<Integer> v = new Vector<Integer>();
		Vector<Integer> rep = new Vector<Integer>();
		Vector<Integer> dup = new Vector<Integer>();
			v.add(4);
		//4,1,9,4,8,0,5,8,1,8,6
		v.add(1);
		v.add(9);
		v.add(4);
		v.add(8);
		v.add(0);
		v.add(5);
		v.add(8);
		v.add(1);
		v.add(8);
		v.add(6);
		for(int i:v)
		{
			if(rep.contains(i))
			{
				if(!(dup.contains(i)))
				{
					dup.add(i);
				}
			}
			else
				rep.add(i);
		}
		v.removeAll(dup);
		System.out.println(v.get(0));
		
		
	}

}
