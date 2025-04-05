package www.com.pattern;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size : ");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}



//
//enter the size : 
//5
//1 1 1 1 1 
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 
