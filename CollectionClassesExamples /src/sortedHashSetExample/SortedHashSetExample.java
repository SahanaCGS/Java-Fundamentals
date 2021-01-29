package sortedHashSetExample;

import java.util.*;

public class SortedHashSetExample {
	public static void main(String[] args) {
		TreeSet<String> sortset = new TreeSet<String>();
		sortset.add("a");
		sortset.add("c");
		sortset.add("c");
		sortset.add("d");
		sortset.add("b");
		//sortset.add(null); null not accepted

		for(String str: sortset) {
			System.out.println(str);
		}
		System.out.println(sortset.isEmpty());
		System.out.println(sortset.hashCode());
		System.out.println(sortset.stream());
		System.out.println(sortset.parallelStream());
		System.out.println(sortset.spliterator());
		Object[] obj = sortset.toArray();
		for(Object sr: obj)
		{
			System.out.println(sr);
		}
		
	} 
}
