package wwwww.thread.wwwwwwwww;



class demo extends Thread{
	public void run() {
		
		
		System.out.println("hii welcome to first way");
	}
}




public class ByExtendingThreadClass {

	public static void main(String[] args) {
	

		demo d=new demo();//new state
	
		d.start();
	}

}
