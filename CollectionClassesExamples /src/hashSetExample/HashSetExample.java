package hashSetExample;

import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
	HashSet<String> s1=new HashSet<String>();
	s1.add("duplicate");
	s1.add("words");
	s1.add("not");
	s1.add("allowed");
	s1.add("duplicate");

	Iterator<String> i=s1.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}

}