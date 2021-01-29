package linkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Sachin");  
		al.add("Suchith");  
		al.add("Sadhan");  
		al.add("Sumith");  
		al.add("Sumith");  
		al.add(null);
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
