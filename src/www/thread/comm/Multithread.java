package www.thread.comm;

import java.util.Scanner;

class Operation1 extends Thread{
	
   @Override
public void run() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter num1 : ");
int n1 = sc.nextInt();
System.out.println("Enter num2 : ");
int n2 = sc.nextInt();
int sum=n1+n2;
System.out.println(sum);
System.out.println("Addtition operation completed");

}}

class Operation2 extends Thread{
@Override
public void run() {
	try {System.out.println("priting operation started");
    for(int i=1;i<=5;i++) {
    	System.out.println("hi from print");
    	Thread.sleep(1000);
    }
    System.out.println("Printing operation completed ");}
	

catch(Exception e) {
	
	e.printStackTrace();
}
}
}
class Operation3 extends Thread{
@Override
public void run() {
	Scanner sc=new Scanner(System.in);
	System.out.println("banking operation started");
	System.out.println("enter user name: ");
	
	String uname=sc.next();
	System.out.println("enter pin: ");
	int pin =sc.nextInt();
	if(uname.equals("abc")&& pin==123) {
		System.out.println("valid user");
	}
		else {
			System.out.println("invalid user");
		}
		System.out.println("banking completed");	
}

}

class Multithread{
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Operation1 op1=new Operation1();
		  
		  Operation2 op2=new Operation2();
		
		  Operation3 op3=new Operation3();
		  
		  
		  op1.start();
		  op2.start();
		  op3.start();

	} 
		// TODO Auto-generated method stub
 
}

