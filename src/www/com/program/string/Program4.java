//4)to convert all the lowercase to uppercase or vice versa
package www.com.program.string;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string : ");
		String str=sc.nextLine();
	 
	        String result = ""; 
	        String res="";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (ch >= 'a' && ch <= 'z') {  
	                ch = (char) (ch - 32);  
	            }

	            result += ch; 
	        
	        char chh = str.charAt(i);
	        if (chh >= 'A' && chh <= 'Z') {  
             chh = (char) (chh + 32);  
         }
	        res += chh;
	        }
	        System.out.println("Converted String of all upperCase: " + result);
	        System.out.println("Converted String of all lowerCase: " + res);
	        

	}

}
