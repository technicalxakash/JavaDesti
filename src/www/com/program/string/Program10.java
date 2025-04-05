/*
package www.com.program.string;

import java.util.Scanner;

public class Program10 {

	
	public static char[] bubbleSort(char a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
			  char temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
			    
			}
			}
			
		}
		return a;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the string : ");
		String str1=sc.nextLine();
		
		System.out.print("enter the string : ");
		String str2=sc.nextLine();
		
		if(str1.length()==str2.length()) {
			char arr1[] =new char[str1.length()];
			char arr2[]=new char[str2.length()];
			
			for(int i=0;i<str1.length();i++) {
				
				arr1[i]=str1.charAt(i);
				arr2[i]=str2.charAt(i);
			}

			arr1=bubbleSort(arr1);
			arr2=bubbleSort(arr2);

			
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					System.out.println("Not anagram");
					System.exit(0);
				}
			}
			System.out.println("anagram");
			}
			
		}
	}

*/
package www.com.program.string;

import java.util.Arrays;


public class Program10 {
	public static void main(String[] args) {
		
		String str1="aasss";
		String str2="aass";
		
		if(str1.length()==str2.length()) {
		char[] str11=str1.toCharArray();
		char[] str12=str2.toCharArray();
		
		 
		Arrays.sort(str11);
		Arrays.sort(str12);
		

		
		 if (Arrays.equals(str11, str12)) {
             System.out.println("It is an anagram");
             System.exit(0);
         } 
		 
		
		 
		}
		System.out.println("It is not an anagram");
		
		
	}
		}

