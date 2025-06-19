package Oops.www.com;

class Bike{
	
		String name ="BLue";
	}
	


class Honda extends Bike{
	String name="Red";
	void display() {
		
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class InvokingVariablesMethodOverrSuper {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.display();
 
	}

}
