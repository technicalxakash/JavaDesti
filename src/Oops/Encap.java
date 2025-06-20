package Oops;

class A{
	
	private int var;

	public void setname(int x) {
		var=x;
	}
	
	public int getname() {
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


