package wwwww.thread.wwwwwwwww;

class demo2 implements Runnable{

	@Override
	public void run() {
System.out.println("hiiiii");
for(int i=0;i<=10;i++) {
	System.out.println(i);
}
	}
	
	
}




public class ByImplemnetingRunnableInterface222 {

	public static void main(String[] args) {
		
		demo2 d=new demo2();
		Thread t=new Thread(d);
		t.start();
	}

}
