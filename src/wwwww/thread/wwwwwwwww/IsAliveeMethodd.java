package wwwww.thread.wwwwwwwww;

class demooo extends Thread{
	
	public void run() {
		System.out.println("hii");
	}
}


public class IsAliveeMethodd {

	public static void main(String[] args) {
		
		demooo d=new demooo();
		System.out.println(d.isAlive());
		d.start();
		System.out.println(d.isAlive());
		
		
	}

}
