package wwwwwwwww.exception;


class UserNotFOundException extends Exception{
	public UserNotFOundException(String msg) {
		super(msg);
	}
}
class Bankk{
	String user ="akash";
	

	void user(String user1) throws UserNotFOundException  {
		if(!user1.equals(user)) {
			throw new UserNotFOundException("not user present");
		}
		else {
			System.out.println("user is there");
		}
	}
	}



public class CustomException2  {

	public static void main(String[] args) throws UserNotFOundException {
		Bankk a=new Bankk();
		a.user("akash");
		

	}

}
