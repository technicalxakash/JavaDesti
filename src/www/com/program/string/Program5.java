//5)Find the sum of Vowels in the given String
package www.com.program.string;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");

		String str=sc.nextLine();

		int sum=0;


		for(int i=0;i<str.length();i++) {

			
				if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {

					sum=sum+str.charAt(i);
				}

			}
		

		System.out.println("the sum of all the vowels present int he string is : "+sum);

	}

}
