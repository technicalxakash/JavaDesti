package wwwww.thread.wwwwwwwww;

//using Extending Thread class

class demo222 extends Thread{

	@Override
	public void run() {
		
		
		System.out.println("hiiiii");
		try {
	
for(int i=0;i<=10;i++) {
	
	Thread.sleep(1000);
	System.out.println(i);
}
	}
	
catch(InterruptedException e) {
	e.printStackTrace();
}
	}
	}



public class JooinMethod {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		demo222 d=new demo222();
		d.start();
		d.join();
		demo222 d1=new demo222();
		d1.start();
		

	}

}
