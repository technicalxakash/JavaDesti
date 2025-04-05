package Programs;

import java.util.Scanner;

public class SumTheVowels {

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
		

		System.out.println(sum);

	}



}


