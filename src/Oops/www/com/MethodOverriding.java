package Oops.www.com;

class College{
	void marry() {
		System.out.println("kavya is very joyful girl");
	}
}

class Employee extends College{
	void marry() {
		System.out.println("now kavya is worried about jevna");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
Employee e=new Employee();
e.marry();
	}

}
