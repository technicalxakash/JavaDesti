package www.collection;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
			
		java.util.Set<Integer> s=new HashSet<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(300);
		s.add(400);
		System.out.println("First set "+s);
		
		
		java.util.Set<Integer> s1=new HashSet<Integer>();
		
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
		
		s.containsAll(s1);
		System.out.println("Conatains or subset "+s);
		
		
		
		
		
		
	}

}
