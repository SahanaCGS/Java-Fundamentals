package LambdaExpressionExample;

interface Learnable{
	//public String learn();
	public  String read(String name);
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		/*Learnable l1=()->{
			return "I am learning";
		};
		System.out.println(l1.learn());*/

		
		Learnable r1=(name)->{
			return "I am Reading" +name;
		};
		System.out.println(r1.read("Java"));
	}
}
