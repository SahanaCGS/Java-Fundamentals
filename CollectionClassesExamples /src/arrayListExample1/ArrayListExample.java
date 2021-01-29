package arrayListExample1;
import java.util.ArrayList;

class ArrayListExample
{
	public static void main(String[] args) {
		ArrayList<String> colorlist = new ArrayList<String>();
		colorlist.add("white");
		colorlist.add("black");
		colorlist.add(null);
		colorlist.add("blue");
		colorlist.add("yellow");
		colorlist.remove("black");
		System.out.println("The size of colorlist is "+colorlist.size());
		for(String colorlistelements: colorlist) {
			System.out.println("color="+colorlistelements);
		}
		
		ArrayList<String> extracolorlist = new ArrayList<String>();
		extracolorlist.add("indigo");
		extracolorlist.add("violet");
		extracolorlist.add("orange");
		extracolorlist.add("red");
		for(String extraelements: extracolorlist) {
			System.out.println("Extracolors="+extraelements);
		}
		
		if(extracolorlist.contains("indigo")) {
			System.out.println("Pass");
		}
		ArrayList<String> testcolors = new ArrayList<String>();
		testcolors.add("white");
		testcolors.add(null);
		testcolors.add("blue");
		testcolors.add("yellow");
		if(colorlist.equals(testcolors)) {
			System.out.println("Collections are matching");
		}
		
		if(colorlist.containsAll(testcolors)) {
			System.out.println("Contains all elements of testcolors");
		}
		if(colorlist.containsAll(extracolorlist)) {
			System.out.println("Contains all elements of extracolorlist");
		}
		else {
			System.out.println("Doesnot contains all elemstnts of extracolorlist ");
		}
		
		
		colorlist.addAll(extracolorlist);
		System.out.println("adding extracolors to colorlist"+colorlist);
	
		if(colorlist.retainAll(extracolorlist)) {
		System.out.println("not retains"+colorlist);
		System.out.println("retains elements of extracolorlist collection"+extracolorlist);

	}
		extracolorlist.clear();
		System.out.println(extracolorlist);
	}
}