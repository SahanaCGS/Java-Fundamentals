package ExampleComparable;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleComparable {

	public static void main(String[] args) {
			ArrayList<Student> al = new ArrayList<Student>();
			al.add(new Student(101, 25, "Sahana"));
			al.add(new Student(102, 45, "Sweety"));
			al.add(new Student(103, 8, "Suchith"));
			al.add(new Student(104, 55, "Shankar"));
			
			Collections.sort(al);
			
			for( Student st1: al) {
				System.out.println(st1.id+ " "+st1.age+" "+st1.name);
			}
	}

}
