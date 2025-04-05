package Oops.www.com;

public class admin extends Developer {


		public void manage() {
			super.read();
			write();
			
			System.out.println(" he can manage ");
		}
       public void read() {
    	   
    	   System.out.println("admin can read ");
       }


}
 //child extends parent