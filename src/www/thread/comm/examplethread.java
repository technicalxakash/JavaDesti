package www.thread.comm;

public class examplethread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() );
		Thread t1=new Thread();
		System.out.println(t1);
		t1.setName("Akas");
		t1.setPriority(9);
		System.out.println(t1);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		
		

	}

}

