package wwwwwwwww.exception;

class InsufficientFundException extends Exception{
	public InsufficientFundException(String msg) {
		super(msg);
	}
}

class Bank{
	double initialamount;
	Bank(double initialamount){
		this.initialamount=initialamount;
	}
	void withdraw(double amount) throws  InsufficientFundException{
		if(amount>initialamount) {
			throw new InsufficientFundException("not validate");
		}
		else {
			System.out.println("valid");
		}
	}
	}


public class CustomException {

	public static void main(String[] args) throws InsufficientFundException {
		Bank a=new Bank(10000);
		a.withdraw(20000);
	}

}
