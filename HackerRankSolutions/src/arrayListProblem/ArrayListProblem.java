package arrayListProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblem {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        int noOfLines = Integer.parseInt(sc.nextLine());
	        ArrayList<ArrayList> al = new ArrayList<ArrayList>();
	        for(int i = 0;i<noOfLines;i++){
	            int noOfIntegers = sc.nextInt();
	            ArrayList<Integer> arrList =  new ArrayList<Integer>();
	            for(int j=0;j<noOfIntegers;j++){
	                arrList.add(new Integer(sc.nextInt()));
	            }
	            al.add(arrList);
	            sc.nextLine();
	        }
	        int numQueries = Integer.parseInt(sc.nextLine());
	        for(int i=0;i<numQueries;i++){
	            int x = sc.nextInt()-1;
	            int y = sc.nextInt()-1;
	            sc.nextLine();
	            if(x<al.size() && y<al.get(x).size()){
	                System.out.println(al.get(x).get(y));
	            }else{
	                    System.out.println("ERROR!");
	                }
	        }
	}

}
