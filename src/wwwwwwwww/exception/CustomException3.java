package wwwwwwwww.exception;
class invalidAmountExceptions extends Exception{
	invalidAmountExceptions(String msg) {
		super(msg);
	}
	
}

class Bankkkk{
	int amount=1000;
	
	void amountExe(int amt) throws invalidAmountExceptions {
		if(amount>=amt) {
			System.out.println("valid");
		}
		else {
			throw new invalidAmountExceptions("invalid amount exceptions");
		}
	}
}
public class CustomException3 {//invalid amount exceptions

	public static void main(String[] args) throws invalidAmountExceptions {
		
		
		Bankkkk b=new Bankkkk();
		b.amountExe(1);

	}

}
