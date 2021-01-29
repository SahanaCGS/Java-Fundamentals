package stackExample;

import java.util.Iterator;
import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  //last added element is  Garima it will be deleted first 
		stack.add(null);

		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
