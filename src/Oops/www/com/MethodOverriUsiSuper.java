package Oops.www.com;
//using super keyword we can call parent implementation having same method name
class Collegee{
	void marry() {
		System.out.println("kavya is very joyful girl");
	}
}

class Employeee extends Collegee{
	void marry() {
		super.marry();
		System.out.println("now kavya is worried about jevna");
	}
}
public class MethodOverriUsiSuper {

	public static void main(String[] args) {
		
			Employeee e=new Employeee();
			e.marry();

	
	}
}
