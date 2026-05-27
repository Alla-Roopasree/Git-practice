package Collections;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class Queuecalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
//		ArrayDeque<Integer> q = new ArrayDeque<>();
//		Array arr=new Array();
		Vector<Integer> v= new Vector<>();
		v.add(0);
		v.add(-1);
		q.add(1);
		q.addAll(v);
		q.offer(10);
		q.offer(34);
		q.offer(24);
		q.offer(34);
		q.offer(24);
		q.offer(9);
//		q.offer(null);
		q.offer(24);
//		q.offerFirst(10);
//		q.offerLast(11);
//		System.out.println(q);
////		System.out.println(q.remove());
//		
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q.poll());
//		System.out.println(q);
//		System.out.println(q.size());
//		System.out.println(q.peek());
		//use while instead of for each it just take the element 
//		but we can't apply peek on it so use while loop
		System.out.println("\n");
		
//		while(!q.isEmpty())
//		{
//			System.out.println(q.poll());
//		}
//		System.out.println(q.size());
//		System.out.println(q.contains(10));
//	q.clear();
//	System.out.println("remove"+q.removeAll(q));//returns true or false 
		
		
	}

}
