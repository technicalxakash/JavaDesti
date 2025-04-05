package www.com.pattern;

import java.util.Scanner;

public class patter8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int size=sc.nextInt();
		int count=size*size;
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				System.out.printf("%3d",count);
				count--;
			}
			System.out.println();
		}

	}

}


//enter the size : 
//5
//25 24 23 22 21 
//20 19 18 17 16 
//15 14 13 12 11 
//10 9 8 7 6 
//5 4 3 2 1 
