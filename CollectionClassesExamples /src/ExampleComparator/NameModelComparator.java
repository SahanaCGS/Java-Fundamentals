package ExampleComparator;

import java.util.Comparator;

public class NameModelComparator implements Comparator {
	@Override
	public int compare(Object ob1,Object ob2) {
		Mobile m1 = (Mobile)ob1;
		Mobile m2 = (Mobile)ob2;
		
		return m1.model.compareTo(m2.model);
	}
}
