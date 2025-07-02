package wwwww.thread.wwwwwwwww;
class Onlinebooking {
    void bookticket() {
        try {
            Thread.sleep(1000); // Simulating time taken to book a ticket
            
            synchronized (this) {  // <-- synchronized block
                for (int i = 0; i < 10; i++) {
                    System.out.println("Ticket booked for passenger " + i);
                }
            }
            
        } catch (InterruptedException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}

class Person1 extends Thread {
    Onlinebooking ob;

    public Person1(Onlinebooking ob) {
        this.ob = ob;
    }

    public void run() {
        ob.bookticket();
    }
}

class Person2 extends Thread {
    Onlinebooking obj;

    public Person2(Onlinebooking obj) {
        this.obj = obj;
    }

    public void run() {
        obj.bookticket();
    }
}
public class SynchroBlock {

	public static void main(String[] args) {

		
		Onlinebooking obj = new Onlinebooking();
        Person1 p = new Person1(obj);
        Person2 p1 = new Person2(obj);
        p.start();
        p1.start();

	}

}
