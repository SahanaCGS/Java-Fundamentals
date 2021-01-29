package linkedHashSetExample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {


		public static void main(String[] args) {
			LinkedHashSet<String> set=new LinkedHashSet<String>();  
			set.add("Ravi");  
			set.add("Vijay");  
			set.add("Ravi");  
			set.add("Ajay"); 
			//only one null is accepted
			set.add(null);  
			set.add(null);  
			set.add(null);  

			Iterator<String> itr=set.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
		}
}
