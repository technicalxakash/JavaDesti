package wwwww.thread.wwwwwwwww;

class demo234 extends Thread{

	
	
	public void run() {
		System.out.println("6");
		try {
			
			System.out.println();
		}
		
		catch(Exception e){
			e.getMessage();
		}


	}
	
	
}



class demo2345 extends Thread{

	
	
	public void run() {
		System.out.println("7");
		try {
			
			System.out.println();
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
		d.setPriority(6);
		demo2345 d1=new demo2345();
		d1.setPriority(7);
		d1.start();
		d.start();
		System.out.println(d1.getPriority());
		System.out.println(d.getPriority());
		
		
//		System.out.println(d.getPriority());
//		d.setPriority(6);
		
		//System.out.println(d.getPriority());
	}

}
