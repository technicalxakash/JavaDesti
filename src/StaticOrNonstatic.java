
public class StaticOrNonstatic {
	
	static int number;
static {
System.out.println("hi");
number=10;
	}
	{	
		System.out.println("hello");
		number=10;		
	}
	public StaticOrNonstatic()
	{		
		System.out.println("great");
	
	}
		
	public static void main(String[] args) {
	System.out.println("hiii hiii");
	//new StaticOrNonstatic();
//	StaticOrNonstatic t1=new StaticOrNonstatic();
//	System.out.println(t1.number);
	StaticOrNonstatic t1=new StaticOrNonstatic();
	StaticOrNonstatic t2=new StaticOrNonstatic();
	StaticOrNonstatic t3=new StaticOrNonstatic();
	StaticOrNonstatic t4=new StaticOrNonstatic();
	StaticOrNonstatic t5=new StaticOrNonstatic();
}
}