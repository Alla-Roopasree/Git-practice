package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class Streams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //remove the dup from collection only first 4 numbers
		
//	List<Integer> list = List.of(1,2,1,3,4,5,6,1,2,3);
//		list.stream().distinct().limit(4).forEach(System.out::println);
		
//		Integer[] arr = {5,12,14,18,20,12,24,26,28,30};
//		String[] obj=Arrays.stream(arr).distinct().filter(n->n%2==0).filter(n->n>10).skip(2).limit(3).map(n->String.valueOf(n)).toArray(String[]::new);
//		System.out.print(Arrays.toString(obj));
//		
//		
//		List<String> list = Arrays.asList("Surat","Sholing","Srinagar","Surat","Secendhrabad","Salem");
//	list.stream().distinct().filter(n->n.startsWith("S")).map(n->n.toUpperCase()).skip(1).forEach(System.out::println);
//		
//	String sentence = "Stream operations are powerful!";
//	int[] arr=sentence.chars().skip(5).distinct().limit(10).toArray();
//	System.out.println(Arrays.toString(arr));
		
//	Object[] obj=DoubleStream.of(28.5,31.2,35.0,33.8,31.2,36.5,38.0,40.1).distinct().filter(n->n>30.0).skip(1).limit(3).mapToObj(n->String.valueOf(n)).map(n->n+"oC").toArray();
//	System.out.println(Arrays.toString(obj));
//	
//	
//	List<String> heroes = Arrays.asList("Prabhas","Mahesh","Jr NTR","Balayya","Mahesh","Yash","Prabhas");
//	heroes.stream().distinct().sorted().filter(n->(n.length()>=4)&&(n.length()<=7)).map(n->n.toLowerCase()).forEach(System.out::println);
	
	List<String> missile = Arrays.asList("Agni","Prithvi","Bharmos",
			"Nirbhay","Akash","Thrihul","Prayal","Astra","Sagarika","Prahaar");
	
		
	missile.stream().map(s->s.toUpperCase()).skip(3).limit(5).forEach(System.out::println);
	}
	
}


