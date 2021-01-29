package arrayDequeExample;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<String> ard = new ArrayDeque<String>();
		ard.add("Sahana");
		ard.add("Suchith");
		ard.add("Sachin");
		System.out.println(ard);
		for(String itr: ard) {
			System.out.println(itr);
		}
	}

}
