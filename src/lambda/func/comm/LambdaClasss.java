package lambda.func.comm;



@FunctionalInterface
interface Calculator{
	void add();
	
}



//interface Calculator1{
//	void add();
//	void sub();
//}

public class LambdaClasss {
	public static void main(String[] args) {
		Calculator c=()->{
			System.out.println("Inside add method");
		};
		c.add();
		
//		Calculator1 c1=()->{//it gives error because calculator1 is not a parameter
//			System.out.println("Inside add method");
//		};
		
	}

}