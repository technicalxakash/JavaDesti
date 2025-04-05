package www.com.program.string; //1)palindrome

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string : ");
		String str=sc.next();
	
		String temp="";
		
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
			
		}
		
	
	if(str.equals(temp)) {
		System.out.println("it is a palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	
    sc.close();

	}

}
