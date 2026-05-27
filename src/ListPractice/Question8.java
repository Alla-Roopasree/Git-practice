package ListPractice;

import java.util.Vector;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v1 = new Vector<>();
		v1.add(4);
		v1.add(9);
		v1.add(8);
		v1.add(5);
		Vector<Integer> v2 = new Vector<>();
		Vector<Integer> v3 = new Vector<>();
		v2.add(1);
		v2.add(8);
		v2.add(0);
		v2.add(5);
		v2.add(6);
		v2.add(1);
		if(v1.size()<v2.size())
		{
			for(int i:v1) {
			if(v2.contains(i))
			{
				v3.add(i);
			}
			}
		}
		else
		{
			for(int i:v2) {
			if(v1.contains(i))
			{
				v3.add(i);
			}
			}
		}
		System.out.println(v3);
	}

}
