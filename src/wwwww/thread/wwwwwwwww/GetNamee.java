package wwwww.thread.wwwwwwwww;


class demo23 implements Runnable{

	@Override
	public void run() {
System.out.println("hiiiii");

	}
	
	
}
public class GetNamee {

	public static void main(String[] args) {

demo23 d=new demo23();
Thread t11=new Thread(d);
t11.start();
System.out.println(t11.getName());
t11.setName("akash");
System.out.println(t11.getName());

	}

}
