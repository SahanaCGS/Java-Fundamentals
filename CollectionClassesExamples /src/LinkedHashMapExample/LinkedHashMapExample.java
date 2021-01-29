package LinkedHashMapExample;

import java.util.LinkedHashMap;
import java.util.Map;

class Phone
{
	int id;
	String name,model;
	 Phone(int id, String name, String model) {
		this.id = id;
		this.name = name;
		this.model = model;
	}
}
public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<Integer, Phone> linkmap = new LinkedHashMap<Integer, Phone>();
		Phone newphone = new Phone(1,"honor","a1");
		Phone newphone1 = new Phone(2,"samsung","b1");
		
		linkmap.put(1,newphone);
		linkmap.put(2,newphone1);

	    for(Map.Entry<Integer, Phone> entry:linkmap.entrySet()){    
	        int key=entry.getKey();  
	        Phone b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.model);   
	    }    	}

}
