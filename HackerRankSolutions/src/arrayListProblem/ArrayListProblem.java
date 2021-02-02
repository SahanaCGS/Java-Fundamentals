/*
 Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
 */

package arrayListProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblem {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        int noOfLines = Integer.parseInt(sc.nextLine());
	        //Added ArrayList inside another ArrayList 
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
