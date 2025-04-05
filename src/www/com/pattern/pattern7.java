//package www.com.pattern;
//
//import java.util.Scanner;
//
//public class pattern7 {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size : ");
//		int size=sc.nextInt();
//		int count=1;
//		for(int i=1;i<=size;i++)
//		{
//			for(int j=1;j<=size;j++)
//			{
//				System.out.printf("%3d",count);
//				count++;
//			}
//			System.out.println();
//		}
//
//	}
//	}

//enter the size : 
//5
//1 2 3 4 5 
//6 7 8 9 10 
//11 12 13 14 15 
//16 17 18 19 20 
//21 22 23 24 25 

package www.com.pattern;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int size=sc.nextInt();
		
		for(int i=1;i<=size;i++)
		{
			int count =i;
		
			for(int j=1;j<=size;j++)
			{
				System.out.printf("%3d",count);
				count=count+size;
			}
			System.out.println();
		}
	}

}


//enter the size : 
//5
//  1  6 11 16 21
//  2  7 12 17 22
//  3  8 13 18 23
//  4  9 14 19 24
//  5 10 15 20 25