package ExampleComparable;

public class Student implements Comparable<Student>{
   int id;
   int age;
   String name;
   Student(int id, int age, String name){
	   this.id = id;
	   this.age = age;
	   this.name = name;
   }
   
   @Override
   public int compareTo(Student st) {
	   if(age == st.age) {
		   return 0;
	   }
	   else if(age < st.age) {
		   return 1;
	   }
	   else
		   return -1;
   }
}
