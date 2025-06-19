package Oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MiniProjectStudentManagement {

	public static void main(String[] args) {
		List<Students> a=new ArrayList<Students>();
		
		Students s1 = new Students(101, "Akash", "A");
		Students s2 = new Students(102, "Bhavana", "B");
		Students s3 = new Students(103, "Chirag", "A");
		Students s4 = new Students(104, "Deepa", "C");
		Students s5 = new Students(105, "Eshan", "B");

	       a.add(s1);
	        a.add(s2);
	        a.add(s3);
	        a.add(s4);
	        a.add(s5);
	        
	        for (Students students : a) {
				System.out.println(students);
			}
	        System.out.println("==============================");
	        for (int i = 0; i < a.size(); i++) {
				System.out.println(a.get(i));
			}
	        System.out.println("==============================");
	        ListIterator<Students> s=a.listIterator();
	        while(s.hasNext()==true) {
	        	System.out.println(s.next());
	        }
	        
	        System.out.println("==============================");
	       
	        while(s.hasPrevious()) {
	        	{
	        		System.out.println(s.previous());
	        	}
		        System.out.println("==============================");
	        	Iterator<Students> sa=a.iterator();
	        	while(sa.hasNext()) {
	        		System.out.println(sa.next());
	        	}
	}

}
	}
