
package www.pattern.alpha.numbers;

import java.util.Scanner;

public class patter {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n : ");
	int n=sc.nextInt();
	int i;
	int j;//A
	for(i=0;i<=n-1;i++) {
		for(j=0;j<=n-1;j++) {
			if(i==0 && j!=0 && j!=(n-1)||i==(n/2)||j==0 && i!=0 || j==(n-1) && i!=0) {
			System.out.print(" * ");		
			}
			else {
				System.out.print("   ");
			}
			
		}//B
		System.out.print("   ");
			for(j=0;j<=n-1;j++) {
				//if(i==0 && j!=(n-1) || j==0 || i==(n-1) && j!=(n-1) ||j==(n-1) && i!=0 &&  i!=(n/2) && i!=(n-1)  || i==(n/2) && j!=(n-1)  )
				if(i==0||j==0||i==(n-1)||j==(n-1)){
				System.out.print(" * ");		
				}
				else {
					System.out.print("   ");
				}
				
			}//C
			System.out.print("   ");
			for(j=0;j<=n-1;j++) {
				if( i==0 && j!=0 || j==0 && i!=(n-1) && i!=0 || i==(n-1) && j!=0) {
				System.out.print(" * ");		
				}
				else {
					System.out.print("   ");
				}
			}//D
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(j==0 ||i==0 && j!=0 && j!=(n-1)  ||i==(n-1) && j!=0 && j!=(n-1) || j==(n-1) && i!=0 && i!=(n-1) ) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}//E
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(i==0 && j!=0 || j==0 && i!=(n-1) && i!=0 || i==(n-1) && j!=0 || i==(n/2)) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}//F
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(i==0 && j!=0 || j==0  && i!=0 ||  i==(n/2)) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}//G
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(i==0 && j!=0 || j==0 && i!=(n-1) && i!=0 || i==(n-1) && j!=0 || i==(n/2) && j>=(n/2) || j==(n-1) && i>=n/2) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}//H
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(j==0||j==(n-1) || i==(n/2) ) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				//I
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(i==0||i==(n-1)||j==(n/2)) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}//J
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(i==0 || j==(n/2) || i==(n-1) && j<=(n/2)) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(j==0  || i+j == (n/2) || i-j==(n/2)) {  //k
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//L
					if(j==0 ||i==(n-1) ) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//M
					if ((i == j && i <= n / 2) || (i + j == n - 1 && j >= n / 2) || j==0 || j==(n-1) ) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//N
					if (j==0 || i == j || j==(n-1)) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//o
					if(j==0 && i!=0 && i!=(n-1) ||i==0 && j!=0 && j!=(n-1) && j!=0  ||i==(n-1) && j!=0 && j!=(n-1) && j!=0 || j==(n-1) && i!=0 && i!=(n-1) ) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//P
					 if ((j==0||i == 0 || i == n / 2) && j < n - 1 || j == n - 1 && i < n / 2 ) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//Q
					  if (j==0 && i!=0 && i!=(n-1) ||i==0 && j!=0 && j!=(n-1) && j!=0  ||i==(n-1) && j!=0 && j!=(n-1) && j!=0 || j==(n-1) && i!=0 && i!=(n-1)||i==j && j<=(n/2)) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//R
					  if (j==0||i == 0 && j<=(n/2)|| i == n / 2 && j<=(n/2) ||  i - j == (n / 2)|| j==(n/2) && i<=(n/2)) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//s
					  if (i == 0 || i == n / 2 || i == n - 1 || j==0 && i<=(n/2)|| j==(n-1) && i>=(n/2))  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//T
					  if (i==0 || j==(n/2))  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//U
					  if (j==0 && i!=(n-1) ||i==(n-1)&& j!=0 && j!=(n-1) ||j==(n-1) && i!=(n-1) )  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//V
					  if (j==0 && i<=(n/2) ||i-j==(n/2)||i+j==(n-1)+(n/2)||j==(n-1)&& i<=(n/2) )  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//W
					  if (j==0 && i!=(n-1)||i==(n-1)&& j!=0&& j!=(n-1)||j==(n-1) && i!=(n-1)||j==(n/2)&&i>=(n/2))  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//X
					  if (i==j||i+j==(n-1))  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//W
					  if (i==j && j<=(n/2) || i+j==(n-1) && i<=(n/2) || j==(n/2) && i>=(n/2) )  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//Z
					  if (i==0||i+j==(n-1)||i==(n-1) )  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.println(" ");
			}
	
}
}

