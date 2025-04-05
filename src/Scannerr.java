import java.util.Scanner;

public class Scannerr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the byte value :");
		byte bt=sc.nextByte();
		System.out.println("the byte value you entered is "+bt);
		System.out.println("enter the short value :");
		short sh=sc.nextShort();
		System.out.println("the short value you entered is "+sh);
		System.out.println("enter the integer value :");
		int it=sc.nextInt();
		System.out.println("the integer value you entered is "+it);
		System.out.println("enter the long  value :");
		long lg=sc.nextLong();
		System.out.println("the long value you entered is "+lg);
		System.out.println("enter the float value :");
		float ft=sc.nextFloat();
		System.out.println("the float value you entered is "+ft);
		System.out.println("enter the string value :");
		String str=sc.next();
		System.out.println("the string value you entered is "+str);
		System.out.println("enter the string value :");
		String str1=sc.nextLine();
		System.out.println("the string value you entered is "+str1);

	}

}
