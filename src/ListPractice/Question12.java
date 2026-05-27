package ListPractice;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Vector<Integer> v = new Vector<Integer>();
//		v.add(8);
//		v.add(1);
//		v.add(0);
//		v.add(5);
//		v.add(1);
//		v.add(6);
		LinkedList<Integer> v = new LinkedList<>();
		v.add(8);
		v.add(1);
		v.add(0);
		v.add(5);
		v.add(1);
		v.add(6);
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(v.indexOf(n)+1);
		
	}

}
