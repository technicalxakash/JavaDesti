//3)Capital and small letters of Voweles
package www.com.program.string;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string : ");
		String str=sc.next();
		int UpperCase=0;
		int LowerCase=0;
       
		 for(int i=0;i<str.length();i++) {
	        	
	        	if(str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122 ) 
	        	{
	        		if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
	        			
	        			UpperCase++;
	        		}
	        		else {
	        			
	        			LowerCase++;
	        		}
	        			}	
	        		}
		 System.out.println(UpperCase);
		 System.out.println(LowerCase);

	}

}
