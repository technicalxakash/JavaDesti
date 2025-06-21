package Oops.www.com;

abstract class Tv{
	
	abstract void switchon();
	abstract void switchoff();
	void watching() {
		System.out.println("i will watch tv");
	}
			
}

class person extends Tv{

	@Override
	void switchon() {
		System.out.println("swtch on");
		
	}

	@Override
	void switchoff() {
		System.out.println("swtch off");
		
	}
	
	
	
}

public class abstractClass {

	public static void main(String[] args) {
		
		person p=new person();
		p.switchon();
		p.switchoff();
		p.watching();
		
		
		
		
	}

}
