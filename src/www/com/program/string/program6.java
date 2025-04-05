
//6)Write a program to find the product of all the element which is present in the even position and is not a vowel
package www.com.program.string;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		long product=1;
		
		for(int i=0;i<str.length();i++) {
           if(i%2==0)
			{
				if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&
						str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u'&&str.charAt(i)!='A'&&str.charAt(i)!='E'&&str.charAt(i)!='I'&&str.charAt(i)!='O'&&str.charAt(i)!='U')
						
				{

					System.out.println("Considered elements "+str.charAt(i));
					product=product*str.charAt(i);
				}

			}
		}
		System.out.println("the product = "+product);

	}

}
