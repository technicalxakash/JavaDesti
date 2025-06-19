package Oops.www.com;

class students{
	int id;
	String name;
	students(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class job extends students{
	double salary;
	public job(int id,String name,double salary){
		super(id,name);
		this.salary=salary;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}


public class ReuseConstructors {

	public static void main(String[] args) {
	
        job j=new job(1,"manasa",25000);
        j.display();
	}

}
