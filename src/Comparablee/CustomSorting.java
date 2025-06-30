package Comparablee;

import java.util.Comparator;
import java.util.TreeSet;

class Emplyoee{
	int id;
	double salary;
	int age;
	public Emplyoee(int id, double salary, int age) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emplyoee [+id=" + id + ", salary=" + salary + ", age=" + age + "]";
	}
}

class SortbyId implements Comparator<Emplyoee>{

	@Override
	public int compare(Emplyoee o1, Emplyoee o2) { //o1=current object o2=exsisting object o1-o2=ascending,o2-o1=desce
		
		return o1.id-o2.id;//ascending
	}
	

}

class SortbyAge implements Comparator<Emplyoee>{

	@Override
	public int compare(Emplyoee o1, Emplyoee o2) {
		// TODO Auto-generated method stub
		return o2.age-o1.age;//descending
	}
	}



public class CustomSorting {

	public static void main(String[] args) {
	
		Emplyoee s1=new Emplyoee(102, 200000, 26);
		Emplyoee s2=new Emplyoee(101, 400000, 27);
		Emplyoee s3=new Emplyoee(103, 500000, 28);
		
		TreeSet<Emplyoee> a=new TreeSet<Emplyoee>(new SortbyId());
		a.add(s1);
		a.add(s2);
		a.add(s3);
				for (Emplyoee emplyoee : a) {
					System.out.println(emplyoee);
				}
				System.out.println("=====================================");
				TreeSet<Emplyoee> aa=new TreeSet<Emplyoee>(new SortbyAge());
				aa.add(s1);
				aa.add(s2);
				aa.add(s3);
						for (Emplyoee emplyoee1 : aa) {
							System.out.println(emplyoee1
									);
						}
	}

}
