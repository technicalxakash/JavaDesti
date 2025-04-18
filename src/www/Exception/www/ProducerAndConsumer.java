package www.Exception.www;


class Queue{
	
	int x;
	public void put(int i) {
		x=i;
		System.out.println("I have produced the value "+i+" into x");
		
	}
	public void get() {
		
		System.out.println("I have consumed the value "+x+" from x");
	}
	
		
}
class Producer extends Thread{
	Queue a;
	public Producer(Queue q) {
		a=q;
		
	}
	@Override
	public void run() {
		
		int i=1;
		while(true) {
			a.put(i++);
		}
	}
	
	
	
}
class Consumer extends Thread{
	Queue b;
	public Consumer(Queue q) {
		b=q;
	}
	@Override
	public void run() {
		
		int i=1;
		while(true) {
			
			b.get();
		}
	}
	
}
public class ProducerAndConsumer {

	public static void main(String[] args) {
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		
		
		p.start();
		c.start();
				

	}

}
