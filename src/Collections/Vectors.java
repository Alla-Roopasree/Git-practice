package Collections;
import java.util.Arrays;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector v= new Vector();
		Vector<Integer> v1= new Vector<>();
		v1.add(20);
		v1.add(30);
		v1.add(50);
		v.add(0, -1);
		v.add("Roopa");
		v.addAll(1,v1);
		v.add(v1);
		System.out.println(v);
//		v.clear();
		v.remove(0);
//		v.removeAll(v1);
//		v.Con
v.set(0, 14);  //updatting the element at particular index //set doesn't add new element 
//if there are up to 4 th position elements are there if we want to add at 5th position 
//we can't use set we can use add

		System.out.println("4th element : "+v.get(3));
		System.out.println(v);
		v1.size();
		v1.capacity();
		System.out.println(v1.indexOf(100));
		v1.isEmpty();
		v1.lastIndexOf(50);
		v1.firstElement();
		v1.lastElement();
		
		
		//if we want to convert to arrays
		
		v1.toArray();
		Object[] arr = new Object[] {1,47,109};
		Arrays.asList(arr);
//		Arrays.toString()
		
		
	}

}
