package www.ww.Interface;

interface notification {

	void alert();
}

class Email implements notification{

	@Override
	public void alert() {
		System.out.println("i will alert using email");
	}
	
}
public class interfacepgms {

	public static void main(String[] args) {
		
		Email e=new Email();
		e.alert();

	}

}
