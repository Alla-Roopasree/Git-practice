package ListPractice;

import java.util.Vector;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<String>();
		v.add("baby");
		v.add("ball");
		v.add("soap");
		v.add("baby");
		v.add("Shampoo");		
		v.add("chaclk");
		v.add("soap");
		v.add("MakeUp");
		v.add("baby");
		v.add("lotion");
		Vector<String> dup = new Vector<String>(v.size()); 
		Vector<String> count = new Vector<>(v.size());
		//babyballsoap
		
		for(String s:v)
		{
			if(dup.contains(s))
			{
			if(!count.contains(s))	
				count.add(s);
				
			}
			else
				dup.add(s);	
		}
		dup.removeAll(count);
		System.out.println(count);
		System.out.println(dup);
		v.removeAll(dup);
		
		System.out.println(v);
		
		for(String i:v)
		{
		       Vector<String> v1dup = new Vector<String>();
		       if((v1dup.contains(i)))
				v1dup.add(i);
		}
	};

}
