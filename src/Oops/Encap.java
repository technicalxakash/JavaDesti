package Oops;

class A{
	
	private int var;
	void setname(int x) {
		var=x;
	}
	
	int getname() {
		return var;
	}		
}

public class Encap {

	public static void main(String[] args) {

		A a=new A();
		a.setname(12);
		System.out.println(a.getname());
		
		
	}


	}


