package www.collection;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		Stack<Integer> a=new Stack<Integer>();
		a.push(100);
		a.add(200);
		a.add(300);
		a.add(400);
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a.pop());
		System.out.println(a);
		System.out.println(a.search(100));
		
		
	}

}
