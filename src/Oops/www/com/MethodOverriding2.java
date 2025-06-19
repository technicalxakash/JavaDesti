package Oops.www.com;

class payment{
	void makePayment() {
		System.out.println("I will make payment");
	}
}

class creditcard extends payment{
	void makePayment() {
		System.out.println("I will make payment creditcard");
	}
}
class cod extends payment{
	void makePayment() {
		System.out.println("I will make payment throug cod");
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		 creditcard c=new creditcard();
    	 c.makePayment();
    	 
    	 
    cod c1=new cod();
    c1.makePayment();

	}

}
