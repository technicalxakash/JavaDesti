package www.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fast_fails_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> a =new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(23);
		//System.out.println(a);
		Iterator<Integer> s=a.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}

	}

}
