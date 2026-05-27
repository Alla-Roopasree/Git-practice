package Streams1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams1 {

	
	private static int[] num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Integer[] arr = {1,3,4,5};
		int min=Arrays.stream(arr).filter(n->n%2!=0).findFirst().orElse(-1);
		//findAny
		//List.of()
//		Stream.concat(stream1, stream2);
//		in doubleStream there is decimal point so we dont have range
		//terinary operations in streams
		
		//forEach,max,min,collect,count,findFirst/findAny,anyMatch,allMatch,noneMatch,reduce,toArray
		//any match will return boolean 
		//in min Arrays.stream(arr).min(Integer::compareTo).orElse(-1);
		//or else we can use optional calss ainstead of orelse directly minnumber.orElse(-1)
		//maptoObject will convert to primitive to non primitive data type
		
//		.collect(collectors.toList())
//		.collect(Collectors.toCollection(ArrayList::new))
//		.collect(Collectors.toMap(word->word,word->word.length,(r,e)->null)); if we have duplicates we can take it as null
//		if 
		
		
		//stream sources
		
		
		//Array, collections, strings , generate the stream source using the primitive data like intStream() method
		//using Stream.of("roopa","sree","alla"),IntStream.of(1,2,3),IntStream.range(10,100),IntStream.rangeClosed(10,100),stream.iterate(1,n->n+1).limit(5),stream.generate(()->Math.random()).limit(3);
		//IntStream.iterate(1,value->value<30,value+1)
		//from strings
//		s.lines(),s.chars,s.split(" ") gives array of strings so we can use like below
		//Arrays.stream(s.split(" "))
		//using files
//		br.lines()
		
		
		
		
		//using Arrays  Arrays.stream(arr)
//		Stream.of(arr)
		//
		
//		intermidiate operations  filter,map,peek,sorted,distinct,limit,skip,flatMap  returns a streams
		//we can have 0 or more intermidate operations
		//flatmap used in case of nested streams streams of streams
		
		
//		List<Integer> nu= List.of(1,2,3,4,5,6,7,8);
//		nu.add(1);
//		nu.stream().forEach(l->
//		System.out.println(l));
		
		
//		nu.stream().filter(n->n%2==0).forEach(l->
//		System.out.println(l));
//		
		
//		nu.stream().filter(
//				
//					n->n%2==0
//				).forEach(l->
//		System.out.println(l));
//		Predicate<Integer> pred = new Predicate<Integer>()
//				{
//			public boolean test(Integer i)
//			{
////				for(int i=2;i<=100;i++)
////				{
//				int flag= 0;
//					for(int j=2;j<i;j++)
//					{
//						if(i==1)
//						{
//							flag=-1;
//						}
//						
//						else if(i==2)
//						{
//							
//							flag= 0;
//						}
//						else if(i%j==0) 
//							flag=-1;
//						
//					}
////				}
//				return flag==0;
//			}
//			
//				};
//				Long c=IntStream.rangeClosed(1,100).filter(i->{
//				for(int j=2;j<i;j++)
//				{
//					if(i==1)
//					{
//						return false;
//					}
//					
//					else if(i==2)
//					{
//						
//						return true;
//					}
//					else if(i%j==0) 
//					return false;
//					
//				}
//				
//
//				return true;
//			 
//				}).peek(System.out::println).count();
//		
//		System.out.println(c);
	
//		int c=(int)IntStream.generate(()-> new Random().nextInt(100)).limit(100).skip(0).filter(i->{
////		Long c=IntStream.iterate(1,n->n+3).limit(100).skip(100).filter(i->{
////			Long c1=IntStream.iterate(1, n->n<=30 ,n->n+3).limit(100).skip(0).filter(i->{
//			for(int j=2;j<i;j++)
//			{
//				if(i==1)
//				{
//					return false;
//				}
//				
//				else if(i==2)
//				{
//					
//					return true;
//				}
//				else if(i%j==0) 
//				return false;
//				
//			}
//			
//
//			return true;
//		}).toArray().length;
////			}).peek(System.out::println).count();
//	
//	    System.out.println(c);
//		
//		List<String> li= new ArrayList<String>();
//		li.add("roopa");
//		li.add("sree");
//		li.add("alla");
//		
//		boolean t=li.stream().map(s->s.toUpperCase()
////			Long c=IntStream.iterate(1,n->n+3).limit(100).skip(100).filter(i->{
////				Long c1=IntStream.iterate(1, n->n<=30 ,n->n+3).limit(100).skip(0).filter(i->{
////				).toArray().length;
//				).sorted(Comparator.reverseOrder()).noneMatch(n->n.endsWith("A"));
//		
//		    System.out.println(t);

	    
	  //How to deal with the Arrays
		//Streams deals with only wrapper classes Generics
		
//		int[] num = new int[5];
//				num[0]=1;
//				num[1]=2;
//				num[3]=4;
//				num[2]=5;
//				for(int i=0;i<4;i++)
//				{
//		System.out.println(num[i]);
//		
//		}
		
		String s="Hi\nam Roopa\nSree";
		System.out.println(s);
		s.lines().filter(n->n.length()>2).forEach(System.out::print);
		s.chars().mapToObj(c->(char)c).filter(c->"aeiou".indexOf(c)>=0).forEach(System.out::print);
		
		Integer[] num = {1,2,3,4,5,6,7,8,9,10};
		
		Arrays.stream(num).filter(n->n%3==0).map(n->n*n).forEach(System.out::println);
	}

}
