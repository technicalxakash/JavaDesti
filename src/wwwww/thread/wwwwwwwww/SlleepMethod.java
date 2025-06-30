package wwwww.thread.wwwwwwwww;



class demo22 implements Runnable{

	@Override
	public void run() {
		
		
		System.out.println("hiiiii");
		try {
	
for(int i=0;i<=10;i++) {
	
	Thread.sleep(5000);
	System.out.println(i);
}
	}
	
catch(InterruptedException e) {
	e.printStackTrace();
}
	}
	}
public class SlleepMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo22 d=new demo22();
		Thread t=new Thread(d);
		t.start();
	}

}

