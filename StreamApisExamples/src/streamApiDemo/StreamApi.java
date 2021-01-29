package streamApiDemo;

import java.util.*;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		for(int i=0;i<=100;i++) {
			values.add(i);
		}
		
		//has to print hi 100 times but will not print any value because its an intermediate method
		//also stream() called as lazy 
		// we are just filtering not printing should not execute 
		//If u want to find a value findFirst is termination method which prints hi once 
		//findFirst will return optional
		//if there is no values in list it will return optional.In stream there is method called Optional if we want to print domore once occured we can do using orElse method 
		//
		values.parallelStream().filter(i->{
			System.out.println("h1");
			return true;
		});
		
		
		System.out.println(		values.stream().filter(i->{
			System.out.println("h1");
			return true;
		}).findFirst().orElse(0));
		

		Stream<Integer> s = values.stream();
		s.forEach(System.out::println);
		//s.forEach(System.out::println); Exception:cant reuse stream
		
	}

	
}
