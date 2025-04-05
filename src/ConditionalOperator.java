import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1 : ");
		int num1=sc.nextInt();
		System.out.println("enter the number 2 : ");
		int num2=sc.nextInt();
		System.out.println("enter the number 3 : ");
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3){
			System.out.println("num1 is greater");
		}
		else if(num2>num1 && num2>num3){
			System.out.println("num2 is greater");
		}
			else {
				System.out.println("num3 is greater");
			}
		
	   System.out.println("============================");
		
	   System.out.println("enter the passcode : ");
	   String name=sc.next();
	   System.out.println("enter the key : ");
	   int key=sc.nextInt();
	   if (name.equals("akash")||key==10110) {
		System.out.println("entry permitted");   
	   }
	   else {
		   System.out.println("Not permitted");  
	   }
	   
	   

	}

}
