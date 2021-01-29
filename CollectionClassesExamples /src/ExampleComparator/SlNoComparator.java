package ExampleComparator;

import java.util.Comparator;

public class SlNoComparator implements Comparator{
	public int compare(Object ob1, Object ob2) {
		Mobile m1 = (Mobile)ob1;
		Mobile m2 = (Mobile)ob2;
		
		if(m1.sNo == m2.sNo) {
			return 0;
		}
		else if(m1.sNo > m2.sNo) {
			return 1;
		}
		else
			return -1;
	}
}
