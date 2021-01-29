package streamExample;

import java.util.List;
import java.util.function.Consumer; // all methods in java.util.function are all java 1.8 enhanced methods 
import java.util.Arrays;

interface Actor
{
	public void act();
	public void speech();
	//public void dance();   should not change the interface method declaration once declared if so it will gives error to all classes which implements that interface 
	                        //If you wanted to add after declaring and implemented should define it in interface as default method(java1.8)
	default void dance() {
		System.out.println("Can dance");
	}
}
class Hero implements Actor{
	public void act() {
		System.out.println("I can act");
	}
	public void speech() {
		System.out.println("I can speak");
	}
}

public class MethodReferenceExample {

	
	public static void doubleit(int i) {
		System.out.println(i*2); 
	}
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(55,88,22,35,67);
		//ls.forEach(i -> System.out.println(i));  //
		ls.forEach(System.out::println); //Method Referencing(call by method or forEach method)
		
		/*Consumer<Integer> c = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		}; 
		ls.forEach(c);  */
		
		System.out.println("_______________");
		Consumer<Integer> c = i -> System.out.println(i); 
		ls.forEach(c);
	
		//minimizing codes 
		System.out.println("++++++++++++");
		ls.forEach(i -> System.out.println(i));
		
		//method refernce
		System.out.println("(((((((((((((");
		ls.forEach(System.out::println);  
		
		System.out.println("{{{{{");
		ls.forEach(i -> doubleit(i));
		System.out.println("}}}}}");
		ls.forEach(MethodReferenceExample::doubleit);
		                                                                                                                                                                                                                                                                                                                                                                                                                                              
	}
}
