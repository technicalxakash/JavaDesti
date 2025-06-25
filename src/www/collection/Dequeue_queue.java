package www.collection;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Dequeue_queue {
	public static void main(String[] args) {
			
	Deque<Integer> a=new ArrayDeque<Integer>();
	
    a.add(200);   
    a.add(300);
    a.add(100);
    System.out.println(a);
    //adding
	a.addFirst(10);
	a.addLast(23);
	System.out.println(a);
	a.offerFirst(2);
	a.offerLast(1);
	System.out.println(a);
	
	//accessing
	a.getFirst();
	a.getLast();
	a.peekFirst();
	
	System.out.println(a.getFirst());
	System.out.println(a.peekLast());
	
	//deletion
	System.out.println(a);
	System.out.println(a.removeFirst());
	System.out.println(a.pollLast());
	System.out.println(a);
	
	
	
	}

}
