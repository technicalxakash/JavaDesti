package lambda.func.comm;

@FunctionalInterface
interface Calsi{
	int add(int a,int b);
	
}

public class Lamdawithparameters {
	public static void main(String[] args) {
		Calsi c=(int a,int b)->{
			System.out.println("Inside add method");
			b=a+b;
			return b;
			
		};
		int res=c.add(100, 200);
				System.out.println(res);
	}

}