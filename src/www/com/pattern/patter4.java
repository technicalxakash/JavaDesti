package www.com.pattern;

import java.util.Scanner;

public class patter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
	int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
			System.out.print(" # ");
			}
			System.out.println();
		}

	}

}


//enter the size : 
//6
// #  #  #  #  #  # 
// #  #  #  #  #  # 
// #  #  #  #  #  # 
// #  #  #  #  #  # 
// #  #  #  #  #  # 
// #  #  #  #  #  # 
