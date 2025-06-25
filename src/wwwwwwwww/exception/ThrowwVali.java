package wwwwwwwww.exception;

class Demo{
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("not eligible");
		}else {
			System.out.println("elgible");
		}
	}
}


public class ThrowwVali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Demo.validate(17);
		
	}

}
