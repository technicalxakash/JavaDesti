package www.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		
		q.offer(10);
		q.add(8);
		q.add(3);
		q.add(5);
		q.add(23);
		q.add(4);
		q.add(1);
		
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q.peek());
		
	}

}
