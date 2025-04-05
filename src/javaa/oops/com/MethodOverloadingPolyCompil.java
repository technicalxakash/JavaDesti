package javaa.oops.com;

//polymorphism
//1)compilation time polymorphism is achieved by method overloading
class Calculator{
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a ,float b) {
		return (int)(a+b);
	}
	
	float add(float a, float b ,float c) {
		return a+b+c;
	}
}

public class MethodOverloadingPolyCompil {

	public static void main(String[] args) {
	
		Calculator cal=new Calculator();
		int a=10;
		int b=13;
		float aa=20;
		float bb=30;
		float cc=80;
		System.out.println(cal.add(a, b));
		System.out.println(cal.add(a, bb));
		System.out.println(cal.add(aa, bb, cc));

	}

}

//23
//40
//130.0

