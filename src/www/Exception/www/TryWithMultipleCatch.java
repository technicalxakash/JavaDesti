package www.Exception.www;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithMultipleCatch {

	
	    public static void main(String[] args) {
	        try {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Division operator is initated");
	            System.out.println("enter num1");
	            int n1 = sc.nextInt();//critical statement
	            System.out.println("enter num2");
	            int n2 = sc.nextInt();//critical statement
	            int res = n1 / n2;//critical statement
	            System.out.println(res);
	            System.out.println("division completed");
	            System.out.println("Array operator initiated");
	            System.out.println("enter array size");
	            int size = sc.nextInt();//critical statement
	            int[] arr = new int[size];//critical statement
	            System.out.println("enter the position to add data");
	            System.out.println("enter the position ");
	            int pos = sc.nextInt();//critical statement
	            System.out.println("enter the data");
	            int val = sc.nextInt();//critical statement
	            arr[pos] = val;//critical statement
	            System.out.println("data added");
	            System.out.println("array operation completed");
	        } 
	        catch (InputMismatchException e) {
	            System.out.println("exception handle");
	        }
	        catch (ArithmeticException e){
	            System.out.println("ArithmeticException is genarated");
	        }
	        catch (NegativeArraySizeException e){
	            System.out.println("Array size is negative");
	        }
	        catch(ArrayIndexOutOfBoundsException e){
	            System.out.println("please specify the pos within the array");
	        }
	        catch (Exception e){
	            System.out.println("generic exception");
	        }
	    }
	}

/*Division operator is initated
enter num1
100
enter num2
0
ArithmeticException is genarated

if we put first generic catch block means it wiill give
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Unreachable catch block for InputMismatchException. It is already handled by the catch block for Exception
	Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
	Unreachable catch block for NegativeArraySizeException. It is already handled by the catch block for Exception
	Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
	Unreachable catch block for Exception. It is already handled by the catch block for Exception

	at www.Exception.www.TryWithMultipleCatch.main(TryWithMultipleCatch.java:36)



+++++SO first we need to specify the specific catch block and generic block++++++++++

*/