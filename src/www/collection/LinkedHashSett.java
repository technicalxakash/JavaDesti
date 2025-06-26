package www.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSett {

	public static void main(String[] args) {
HashSet<Integer> s=new LinkedHashSet<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(300);
		s.add(400);
		System.out.println("First set "+s);
		
		
		HashSet<Integer> s1=new LinkedHashSet<Integer>();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(100);
		s1.add(200);
		System.out.println("Second set "+s1);
		
//		s.addAll(s1);
//		System.out.println("Union or addAll "+s);
		
//		s.retainAll(s1);
//		System.out.println("retainall or Intersection "+s);
		
//		s.removeAll(s1);
//		System.out.println("differnece "+s);
		
//		s.containsAll(s1);
//		System.out.println("Conatains or subset "+s);
		
		for(Integer i:s) {
			System.out.println(i.hashCode());
		}

		
		Set<Student> set = new HashSet<>();	
		set.add(new Student(1,"akash"));
		set.add(new Student(2,"kishore"));
		
		for(Student e:set) {
			System.out.println(e.hashCode());
		}
		
		Set<Student>seqwt =new TreeSet<>();
		set.add(new Student(1,"sdfgh"));
		set.add(new Student(1,"sdfgh"));
		set.add(new Student(1,"sdfgh"));
		System.out.println(seqwt);
	}	
	
}

class Student{
	int id;
	String name;


	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}