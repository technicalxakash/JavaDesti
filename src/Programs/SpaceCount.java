package Programs;

import java.util.Scanner;

public class SpaceCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		str=str.trim();
		int space_count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				space_count++;
			}
		}
       int word_count=space_count+1;
       System.out.println("Total number of words is "+word_count);
	}

}
