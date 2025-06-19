package Oops;

public class All_in_one {

	public static void main(String[] args) {
			
		Guest g=new Guest();
		g.read();
		
		System.out.println("============================");
		
		Developer d=new Developer();
		d.read();
		d.write();
		System.out.println("=============================");
		Admin a=new Admin();
		a.read();
		a.write();
		a.manage();
		System.out.println("===========================");
	}

}
