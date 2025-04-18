package www.Exception.www;
class Candiadate extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" has enter the interview cabin");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" is giving the interview inside the cabin");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" has completed the interview and excited interview");
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class MechnisumOfThreadsUsingJoin {

	public static void main(String[] args) throws InterruptedException {
		Candiadate c1=new Candiadate();
		c1.setName("akash");
		Candiadate c2=new Candiadate();
		c2.setName("manasvi");
		Candiadate c3=new Candiadate();
		c3.setName("chandru");
		
//		c1.start();
//		c1.join();
//		c2.start();
//  	c2.join();
//		c3.start();

		c1.start();
		c1.join(5000);
		c2.start();
  	    c2.join();
		c3.start();
	}

}
