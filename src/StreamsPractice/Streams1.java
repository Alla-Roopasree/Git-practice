package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;



public class Streams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] emp = {"John","Alexandar","David","Ben","Chrisina","Amy"};
//		
//		List<String> employees = Arrays.asList(emp);
//		employees.stream().filter(n->n.length()>=5).map(n->n.toUpperCase()).sorted().forEach(n->System.out.println(n));
	
//	String sentence = "Our channel provides Amazing Automation content for java and selenium learners and professionals";
//
//	Arrays.stream(sentence.split(" ")).filter(s->s.startsWith("A")||s.startsWith("a")).map(s->s.toLowerCase()).map(s->{
//		
//		char[] arr = s.toCharArray();
//		String rev = "";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev += arr[i];
//		}
//		return rev;
//	}
//			).sorted().forEach(n->System.out.println(n+" - "+n.length()));
//	
//	
	
//	String[] fruits = {"Apple","Bananna","Avacado","Mango","Apricot"};
//	Set<String> fav_fruits = Set.of("Mango","Papaya","Apricot");
//		Arrays.stream(fruits).filter(s->fav_fruits.contains(s)).sorted(Comparator.reverseOrder()).forEach(System.out::println);

		List<Employee1> employees = Arrays.asList(
				
				new Employee1("Arjun",28000),
				new Employee1("Meera",52000),
				new Employee1("Rahul",61000),
				new Employee1("Divya",47000),
				new Employee1("Kiran",75000),
				new Employee1("Neha",82000)
				);
		Long c=employees.stream().filter(obj->obj.salary>50000).map(obj->{
			if(obj.salary<=30000)
				obj.salary=obj.salary+obj.salary*15/100;
			else if(obj.salary>30000&&obj.salary<=75000)
				obj.salary=obj.salary+obj.salary*12.5/100;
			else
				obj.salary=obj.salary+obj.salary*10/100;
			return obj;
		}).peek(obj->System.out.println(obj.Name+" - "+obj.salary)).count();
		
	System.out.println("Count: "+c);
	}
}
//.map(s->s.length()).sorted().