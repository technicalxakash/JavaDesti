package www.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Listt {

	public static void main(String[] args) {

		List<Integer> a=new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(null);
		a.add(200);
		a.add(200);
		System.out.println("before adding object :"+ a);
		a.add(3,700);
		System.out.println("adding object in specifi index:"+a);
		System.out.println("accessing list object :"+ a.get(2));
		System.out.println("searching first accurance :"+ a.indexOf(3));
		
		//adding one list to another
		//List<Integer> b=new ArrayList<Integer>(a);
		//System.out.println("adding two list:"+b);
		
		System.out.println("contains :"+ a.indexOf(3));
		
		
		//remove
		System.out.println(a);
		//1)remove
		a.remove(0);
		
		
		System.out.println("Removing the objects "+a);
		
		//b.removeAll(a);
		
		System.out.println("size the list "+a.size());
		
		System.out.println("using for loop");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("using for each");
		for(Integer s:a) {
			System.out.println(s);
		}
		
		
		System.out.println(a);
		a.remove(1);
		
		System.out.println("forward direction");
		ListIterator<Integer> c=a.listIterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
		
		System.out.println("reverse directions");
		
		while(c.hasPrevious()) {
			System.out.println(c.previous());
		}
		
	}

}
