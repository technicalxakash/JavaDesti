package www.Exception.www;

import java.util.Scanner;

public class SingleCatchBloack {
	 public static void main(String[] args) {
		 try {
			 Scanner sc = new Scanner(System.in);
		        System.out.println("Division operator is initated");
		        System.out.println("enter num1");
		        int n1 = sc.nextInt();
		        System.out.println("enter num2");
		        int n2 = sc.nextInt();
		        int res = n1/n2;
		        System.out.println(res);
		        System.out.println("division completed");
		        System.out.println("Array operator initiated");
		        System.out.println("enter array size");
		        int size = sc.nextInt();
		        int[] arr = new int[size];
		        System.out.println("enter the position to add data");
		        System.out.println("enter the position ");
		        int pos = sc.nextInt();
		        System.out.println("enter the data");
		        int val = sc.nextInt();
		        arr[pos] =val;
		        System.out.println("data added");
		        System.out.println("array operation completed");
		 }
	 catch(Exception e) {
		 System.out.println("Exception is handled");
	 }
	       
	    }
}

/*
Division operator is initated
enter num1
100
enter num2
0
Exception is handled
*/