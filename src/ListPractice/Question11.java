package ListPractice;

import java.util.Vector;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Delete list1 elemets from lust2
		
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		v1.add(4);
		v1.add(9);
		v1.add(8);
		
		v2.add(4);
		v2.add(1);
		v2.add(9);
		v2.add(4);
		v2.add(8);
		v2.add(0);
		v2.add(5);
		v2.add(1);
		v2.add(6);
		
		v2.removeAll(v1);
		
		System.out.println(v2);
	}

}
