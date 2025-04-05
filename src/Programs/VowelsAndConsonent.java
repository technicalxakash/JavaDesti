package Programs;

import java.util.Scanner;

public class VowelsAndConsonent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string : ");
		String str=sc.next();
		str= str.toUpperCase();
		int vowels=0;
		int consonents=0;
		
		
        for(int i=0;i<str.length();i++) {
        	
        	if(str.charAt(i)>=65 && str.charAt(i)<=90 ) {
        		if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
        			
        			vowels++;
        		}
        		else { 
        			consonents++;	
        		}	
        	}
        }
        System.out.println("Total number of vowels are "+vowels);
        System.out.println("Total number of consonents are "+consonents);

	}

}
