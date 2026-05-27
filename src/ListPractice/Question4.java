package ListPractice;

import java.util.Vector;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		v1.add(4);
		v1.add(9);
		v1.add(8);
		v2.add(5);
		v2.add(0);
		v2.add(10);	
		
		Vector<Integer> v = new Vector<Integer>(v1.size()+v2.size());
		
		v.addAll(v1);
		v.addAll(v2);
		System.out.println(v);
		System.out.println(v.size());
	}

}
