package Comparablee;

import java.util.PriorityQueue;

class Student implements Comparable<Student>{
	String name;
	
	Student (String name){
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return o.name.compareTo(this.name);
	}
	
	
}

public class default_Sorting2 {

	public static void main(String[] args) {
		Student s1=new Student("akash");
		Student s2=new Student("rama");
		Student s3=new Student("manoj");
		
		PriorityQueue<Student> p=new PriorityQueue<Student>();
		p.add(s1);
		p.add(s2);
		p.add(s3);
		for (Student students : p) {
			System.out.println(students);
				}
	}

	}


