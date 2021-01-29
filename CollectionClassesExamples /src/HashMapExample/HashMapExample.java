package HashMapExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hash = new HashMap<Integer,String>();
		hash.put(1, "Sachin");
		hash.put(null, "Sachin");
		hash.put(55, "Sachin");
		System.out.println(hash);
		
		for(Map.Entry m : hash.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hash.putIfAbsent(2, "sana");
		System.out.println(hash);
	     
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(4, "Rose");
		
		System.out.println(map);
		
		map.putAll(hash);
		System.out.println(map);
		
		map.replace(4, "Rosia");
		System.out.println(map);

	}

}
