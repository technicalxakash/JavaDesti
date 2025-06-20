package www.ww.Interface;

interface parent1{
	void whoisfather();
}

interface parent2{
	void whoismother();
}


class Child implements parent1,parent2{

	@Override
	public void whoismother() {
		System.out.println("who is u r mother");		
	}

	@Override
	public void whoisfather() {
		System.out.println("who is u r father");
		
	}
	
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.whoisfather();
		c.whoismother();

	}

}
