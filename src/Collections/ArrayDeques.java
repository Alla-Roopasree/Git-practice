package Collections;

import java.util.ArrayDeque;

public class ArrayDeques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ADQ = new ArrayDeque<Integer>();
		ADQ.addFirst(1);
		ADQ.add(12);
		ADQ.addLast(10);
		ADQ.addAll(ADQ);
		ADQ.offer(12);
		ADQ.offerFirst(13);
		ADQ.offerLast(14);
		ADQ.poll();
		ADQ.pollFirst();
		ADQ.pollLast();
		ADQ.peek();
		ADQ.peekFirst();
		ADQ.peekLast();
		ADQ.removeFirst();
		ADQ.removeLast();
		ADQ.remove();
		
		
		
	}

}
