
package TreeMapExample;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
public class TreeMapExample {

	public static void main(String[] args) {
		 
		   SortedMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(100,"Amit");    
		      map.put(102,"Ravi");    
		      map.put(101,"Vijay");    
		      map.put(103,"Rahul");    
		      //Returns key-value pairs whose keys are less than the specified key.  
		      System.out.println("headMap: "+map.headMap(102));  
		      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
		      System.out.println("tailMap: "+map.tailMap(102));  
		      //Returns key-value pairs exists in between the specified key.  
		      System.out.println("subMap: "+map.subMap(100, 102));    
		  
		      
		      Map<Integer,Book> map1=new TreeMap<Integer,Book>();    
		      //Creating Books    
		      Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		      Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		      Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
		      //Adding Books to map   
		      map1.put(2,b2);  
		      map1.put(1,b1);  
		      map1.put(3,b3);  
		      
		      //Traversing map  
		      for(Map.Entry<Integer, Book> entry:map1.entrySet()){    
		          int key=entry.getKey();  
		          Book b=entry.getValue();  
		          System.out.println(key+" Details:");  
		          System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		      }    
		        
	}

}
