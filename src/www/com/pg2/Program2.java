


package www.com.pg2;
import java.util.Scanner;



 /* 
 * public class Program2 {
 * 
 * public static void main(String[] args) {
 * 
 * //implicit byte b=126; System.out.println("the byte value is "+b);
 * 
 * short s=b; System.out.println("the short value is "+s);
 * 
 * int i=s; System.out.println("the integer value is "+i);
 * 
 * long l=i; System.out.println("the long value is "+l);
 * 
 * float f=l; System.out.println("the float value is "+f);
 * 
 * double d=f; System.out.println("the double value is "+d);
 * 
 * 
 * //implicit type conversion double dd=126.0;
 * System.out.println("the double value is "+d);
 * 
 * float ff=(float)dd; System.out.println("the float value is "+f);
 * 
 * long ll=(long)ff; System.out.println("the long value is "+l);
 * 
 * int ii=(int)ll; System.out.println("the integer value is "+i);
 * 
 * short ss=(short)i; System.out.println("the short value is "+s);
 * 
 * byte bb=(byte)ss; System.out.println("the short value is "+b);
 * 
 * }
 * 
 * }
 

 public class Program2{
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the array size : ");
		 int size =sc.nextInt();
		 int arr[]=new int[size];
		 int sum=0;
		 System.out.println("Enter the array elesmts");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
			 sum=sum+arr[i];
			 
		 }
		 System.out.println("_____________");
		 System.out.println(sum);
		 int square=sum*sum;
		 System.out.println(square);
		 if(square%2==0) {
			 System.out.println("the number is even");
		 }
			 else {
				 System.out.println("the number is not even");
			 }
		 int even=0;
		 int odd=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2==0) {
				 even++;
				 
			 }
			 else {
				 odd++;
				 
			 }
		 }
		 System.out.println("even count ="+even);
		System.out.println("odd count ="+odd);
	}
 }
 */

public class Program2 {

    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {3, 4}, {2, 3} };
        int[][] secondMatrix = { { 5, 3}, {6, 3} };
        

       
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

 }



