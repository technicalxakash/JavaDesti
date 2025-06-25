package Comparablee;

import java.util.PriorityQueue;

class Students implements Comparable<Students>{
	int age;
	
	Students (int age){
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Students [age=" + age + "]";
	}

	@Override
	public int compareTo(Students o) {
		
		return o.age;
	}
	
	
}



public class defaultSorting {

	public static void main(String[] args) {

		
		Students s1=new Students(15);
		Students s2=new Students(8);
		Students s3=new Students(10);
		
		PriorityQueue<Students> p=new PriorityQueue<Students>();
		p.add(s1);
		p.add(s2);
		p.add(s3);
		for (Students students : p) {
			System.out.println(students);
				}
	}

}
