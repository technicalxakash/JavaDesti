/*
 * import java.util.Scanner;
 * 
 * public class arrayy{
 * 
 * public static void main(String[] args) { Scanner sc=new Scanner(System.in);
 * System.out.println("enter the size of an array : "); int n=sc.nextInt();
 * //creating array int arr[]=new int[n]; //collection marks for(int
 * i=0;i<arr.length;i++) {
 * System.out.println("enter the marks of student no :"+i); arr[i]=sc.nextInt()
 * ;
 * 
 * } //display marks for(int i=0;i<arr.length;i++) {
 * System.out.println("the marks of student no :"+i+" is ="+arr[i]); }
 * 
 * 
 * }
 * 
 * }
 */

import java.util.Scanner;

public class arrayy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of wings undre beta group : ");
		int wings=sc.nextInt();
		System.out.println("enter the count of college constructed by keerthi  under each wing : ");
		int col=sc.nextInt();
		
		
		//create 2d array
		long arr[][]=new long[wings][col];
		long overaall_revenue=0;
		
		//collecting data
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("inside the wing number : "+(i+1));
			for( int j=0;j<arr[i].length;j++) {
				
				System.out.println("enter the revenue made by college number - "+(j+1));
				arr[i][j]=sc.nextLong();
				overaall_revenue=overaall_revenue +arr[i][j];
							
			}
			
		}
		System.out.println("-----------------------");
		//display data
         for(int i=0;i<arr.length;i++) {
			
			System.out.println("inside the wing number : "+(i+1));
			for( int j=0;j<arr[i].length;j++) {
				
				System.out.println("revenue made by college number - "+(j+1)+ "is = "+arr[i][j]);
			}
			
		}
         System.out.println("--------------------------");
         System.out.println("overall revenue genreates of all beta instituion are = "+overaall_revenue);
	}}