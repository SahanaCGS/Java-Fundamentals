package ExampleComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExampleComparator {

	public static void main(String[] args) {
			ArrayList<Mobile> al = new ArrayList<Mobile>();
			al.add(new Mobile("onePlus","v1",222));
			al.add(new Mobile("Apple","v3",555));
			al.add(new Mobile("Honor","v9",111));
			
			System.out.println("Sort by name");
			
			Collections.sort(al,new NameModelComparator());
			Iterator itr = al.iterator();
			while(itr.hasNext()) {
				Mobile st = (Mobile)itr.next();
				System.out.println(st.model+" "+st.version+" "+st.sNo);
			}
			
			
			System.out.println("Sort by Age");
			
			Collections.sort(al, new SlNoComparator());
			Iterator itr1 = al.iterator();
			while(itr1.hasNext()) {
				Mobile st = (Mobile)itr1.next();
				System.out.println(st.model+" "+st.version+" "+st.sNo);
			}
	} 

}
