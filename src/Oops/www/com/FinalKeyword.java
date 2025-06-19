package Oops.www.com;

class Bikeeeeee{
	final int speed=120;//final is for decalare not resign
	
	void display() {
		int speed=200;
		System.out.println(speed);
	}
	
	void display1() {
		System.out.println(speed);
	}
}


public class FinalKeyword {

	public static void main(String[] args) {
		Bikeeeeee b=new Bikeeeeee();
		b.display();
		b.display1();

	}

}
