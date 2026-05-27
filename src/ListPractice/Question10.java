package ListPractice;

import java.lang.reflect.Array;
import java.util.Vector;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v= new Vector<>();
		v.add(12);
		v.add(12);
		v.add(12);
		Object[] arr=v.toArray();
		
		
		System.out.println(v);
System.out.println(arr.length+" "+arr[1]);
		
	}

}
