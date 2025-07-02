package wwwww.thread.wwwwwwwww;

class OnlineBooking{
	 synchronized  void bookseat() {
		System.out.println("hii");
		try {			
			Thread.sleep(5000);
			for(int i=0;i<=10;i++) {
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
}
class Person1 extends Thread{	
	OnlineBooking ob1;	
	public Person1(OnlineBooking ob1) {
		super();
		this.ob1=ob1;
		
	}
	public void run() {
		ob1.bookseat();
	}
	
}

class Person2 extends Thread{
	
	OnlineBooking ob2;
	
	public Person2(OnlineBooking ob2) {
		super();
		this.ob2=ob2;
		
	}
	public void run() {
		ob2.bookseat();
	}
	
}


public class SyncornisedMethod {

	public static void main(String[] args) {
	
		OnlineBooking o=new OnlineBooking();
		
		Person1 p=new Person1(o);
		
		Person2 p1=new Person2(o);
		
		p.start();
		p1.start();
	}

}
