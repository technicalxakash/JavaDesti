package wwwww.thread.wwwwwwwww;

class demo234 extends Thread{

	
	public void run() {
		System.out.println("hiiiii");
		try {
			
			for(int i=0;i<=10;i++) {
				System.out.println(i);
				
			}
		}
		
		catch(Exception e){
			e.getMessage();
		}


	}
	
	
}


public class PriorityMethodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo234 d=new demo234();
		d.start();
		
		System.out.println(d.getPriority());
		d.setPriority(2);
		System.out.println(d.getPriority());
	}

}
