package Oops.www.com;

public class Inheritence{

	public static void main(String[] args) {
	

		Guest g=new Guest();
		g.read();
		
		Developer d=new Developer();
		d.read();
		d.write();
		
		admin in=new admin();
		in.read();
		in.write();
		in.manage();
		
	}

}
