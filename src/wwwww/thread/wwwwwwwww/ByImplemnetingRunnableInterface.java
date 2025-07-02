package wwwww.thread.wwwwwwwww;
class demo1 implements Runnable{

	@Override
	public void run() {
		System.out.println("hi");
	}	
}

public class ByImplemnetingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 d=new demo1();
		Thread t=new Thread(d);
		t.start();
	}

}
