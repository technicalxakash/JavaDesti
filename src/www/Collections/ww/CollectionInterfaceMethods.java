package www.Collections.ww;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceMethods {

	public static void main(String[] args) {
		Collection<Integer> a=new ArrayList<Integer>();
	        a.add(10);
	        a.add(20);
	        a.add(30);
	        a.add(40);
	        a.add(50);

	        System.out.println("ArrayList elements: " + a);
	        
	        Collection<Integer> b=new ArrayList<Integer>();
	        b.add(60);
	        b.add(70);
	        b.add(80);
	        b.add(90);
	        b.add(100);


	        System.out.println("ArrayList B: " + b);
	        
		//adding two list
	        a.addAll(b);
	        System.out.println("adding two list "+a);
	        
	        System.out.println("length of size of a "+a.size());//size of list
	        
	        System.out.println("contains the element or not "+a.contains(10));//conatins
	        
	        System.out.println("empty are not "+a.isEmpty());
	        
	        System.out.println("is a element is all present in b eleemnts "+a.containsAll(b));
	        	        
	        System.out.println(a.remove(100));
	        	        		
	        System.out.println(a);

	}

}
