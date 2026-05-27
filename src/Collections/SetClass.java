package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//doesn't allows duplicates and in sorted order
		//hash set internally uses hash map tree set and linked Hash set uses teemap and linked hash map recpectively.
		//maintain random orders
		//linked hash set insertion order
		//tree set sorted order
		//values are objects
		TreeSet<Integer> s= new TreeSet<>();
		s.add(1);
		s.add(10);
		s.add(2);
		s.add(9);
//		s.add(null);
		System.out.println(s); 
		System.out.println("remove"+s.remove(9));
		System.out.println(s); 
		System.out.println(s.contains(1)); 
		Integer b= s.first();
//		s.contains(1);
		s.pollFirst();
		s.pollLast();
		System.out.println(s.subSet(2, 10));
//		2-->inclusive
//		10-->exclusive
//		s.desendingSet()
		
		
	}

}
