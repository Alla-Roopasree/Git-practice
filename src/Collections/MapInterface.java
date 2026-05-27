package Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Map<Integer,String> m = new HashMap<>();
		
//		Map<Integer,String> m = new LinkedHashMap<>();
//		Map<Integer,String> m = new TreeMap<>();
//		Map<Integer,String> m = new Hashtable<>();
		
		
		m.put(101, "Satish");
		m.put(102, "Veena");
		
		m.put(103, "Roopa");
		System.out.println(m.get(101));
		m.put(101,"satti");
		System.out.println(m.get(101));
		m.putIfAbsent(102,"Roopa");
		System.out.println(m.get(102));
		Set<Integer> keys=m.keySet();
		Collection<String> values=m.values();
		for(int i:keys)
		{
			System.out.println(i+" : "+m.get(i));
		}
		Set<Entry<Integer,String>> eset = m.entrySet();
		for(Entry<Integer,String> e:eset)
		{
			System.out.print(e.getKey());
			System.out.println(" - "+e.getValue());
		}
		
		//verify if keys and values are contains in map
		System.out.println(m.size());
		m.replace(102, "Y.Veena");
		System.out.println(m.containsKey(101));
		System.out.println(m.containsValue("satish"));
		m.remove(101);
		System.out.println(m);
		m.clear();
		System.out.println(m);
		
	}

}
