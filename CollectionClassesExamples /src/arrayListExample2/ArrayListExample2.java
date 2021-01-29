package arrayListExample2;

import java.util.*;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<>(); 
	    l.add(10); 
	    l.add(20); 
	    l.add(30); 
	    l.add(40); 
	    
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    arr.add(55);
	    arr.add(66); 
	    arr.add(77); 
	    
	    l.addAll(arr);
	    //l.removeAll(arr);
	    System.out.println(l);
	    l.removeIf(n -> (n % 3 == 0)); 
	    
       
        for (int i : l) { 
            System.out.println(i); 
        } 
	    
	}
	
}
