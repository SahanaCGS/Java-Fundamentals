package stackProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StackProblem {

static boolean isBalanced(String paranString)
{
    List<String>closingParan =  Arrays.asList("}", ")", "]");
    boolean isBalanced = true;
    ArrayList<String> stack = new ArrayList<String>();
    if(paranString.length()>0){
        for(int i = 0;i<paranString.length();i++){
            String paran = paranString.substring(i,i+1); 
            if(stack.size() == 0 && closingParan.contains(paran)){
                isBalanced=false;
                break;
            }else{
                if(paran.equals("{") || paran.equals("(") || paran.equals("[")){
                    stack.add(paran);
                }else{
                    String stackParan = stack.get(stack.size()-1);
                    if((stackParan.equals("{") && paran.equals("}")) || (stackParan.equals("(") && paran.equals(")") || (stackParan.equals("[") && paran.equals("]")))) {
                        stack.remove(stack.size()-1);
                    }else{
                        isBalanced = false;
                        break;
                    }
                }
            }
        }  
    }
    if(stack.size()>0) isBalanced = false;
    return isBalanced;    
}
public static void main(String []argh)
{      
	Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
        if(isBalanced(sc.nextLine())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }       
    }

}
}
