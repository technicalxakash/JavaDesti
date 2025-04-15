package www.thread.comm;

import java.util.Scanner;

public class SingleThread {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int n2 = sc.nextInt();
		int sum=n1+n2;
		System.out.println(sum);
		System.out.println("Addtition operation completed");
		System.out.println("===============================");
        System.out.println("priting operation started");
        for(int i=1;i<=5;i++) {
        	System.out.println("hi from print");
        	Thread.sleep(4000);
        }
        System.out.println("Printing operation completed ");
        System.out.println("======================================");
        
      
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
