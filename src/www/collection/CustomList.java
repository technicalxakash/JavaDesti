package www.collection;

import java.util.ArrayList;
import java.util.List;

class Employee{
	private int id;
	private String name;
	

	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}



public class CustomList {

	public static void main(String[] args) {
			Employee e1=new Employee(101, "akash");
			Employee e2=new Employee(102, "idli");
			List<Employee> a=new ArrayList<Employee>();
			a.add(e1);
			a.add(e2);
			
			for(Employee emp:a) {
				System.out.println(emp);
			}
	}

}
