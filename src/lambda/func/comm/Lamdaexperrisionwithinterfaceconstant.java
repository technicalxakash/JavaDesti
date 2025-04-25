package lambda.func.comm;

@FunctionalInterface
interface Calsi1{
	int a=234;
	int b=560;
	int add(int a, int b);
}

public class Lamdaexperrisionwithinterfaceconstant {
	public static void main(String[] args) {
		Calsi1 c1=(int a,int b)->{
			System.out.println("Inside add method");
			a=Calsi1.a;
			b=Calsi1.b;
			return a+b;
			
		};
		int res=c1.add(100,200);
		System.out.println(res);
	}

}