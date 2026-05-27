package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Streams3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
//		
		Optional<Integer> l=Stream.<Integer>builder()
		.add(3).add(2).add(6).add(2).build().filter(n->n%2==0).peek(System.out::println).min(Integer::compareTo);
		System.out.println(l.orElse(-1));
//		BinaryOperator<Integer> bo = new BinaryOperator<Integer>()
//		{
//
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				// TODO Auto-generated method stub
//				return t+u;
//			}
//			
//		};
//		int l=Stream.<Integer>builder()
//				.add(3).add(2).add(6).add(2).build().filter(n->n%2==0).peek(System.out::println).reduce(0,bo);
//				System.out.println(l);
//				
		
//		
//		String s="45 32 67 89 12 90 5 100";
//		OptionalInt i=Arrays.stream(s.split(" ")).mapToInt(t->Integer.parseInt(t)).min();
//			System.out.println(i.orElse(-1));	
//			
//		
//		List<String> list = List.of("Alice","Steve","bob","Sandra","Mark");	
//		Optional<String> name=list.stream().filter(s1->s1.startsWith("S")||s.startsWith("s")).findFirst();
//		System.out.println("Name starting with S: "+name.orElse(" "));
//			
		
//		String sentence ="Coding with Streams is Excellent and super fun";
//		Optional<String> l1=Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length));
//		Optional<Integer> opt = Optional.empty();
//		System.out.println("Longest word: "+l1.orElse(" ")+" ("+l1.length());
		
//		int[] num= {3,7,9,12,8,15,22};
//		OptionalInt in=Arrays.stream(num).filter(n->n>10).filter(n->n%2==0).findFirst();
//		System.out.println("First even number > 10 is "+in.orElse(-1));
	
		
//		List<Integer> numbers = List.of(2,3,6,8,10,1,4);
//		
		BinaryOperator<Integer> bo= new BinaryOperator<Integer>()
				{

					@Override
					public Integer apply(Integer t, Integer u) {
						// TODO Auto-generated method stub
						return t+u;
					}
			
				};
//		
//		int num=numbers.stream().filter(n->n%2==0&&n>5).reduce(1,bo);
//		System.out.println(num);
		
		
		String input = "a1b2c3d4e5";
		int num=input.chars().mapToObj(s->(char)s).filter(n->"0123456789".indexOf(n)>=0).mapToInt(i->(int)i).reduce(0,bo);
		
		System.out.println(num);
	}
	

}
