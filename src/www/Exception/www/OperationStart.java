//using throws
package www.Exception.www;
/*
import java.util.Optional;
import java.util.Scanner;

class Operation1{
    void function1() throws Exception{
        System.out.println("Inside func 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1 = sc.nextInt();
        System.out.println("enter num 2");
        int num2 = sc.nextInt();
        int res = num1/num2;
        System.out.println(res);
        System.out.println("left fuction 1");
    }
}
class Operation2{
    void function2() throws Exception{
        Operation1 op1 = new Operation1();
        op1.function1();
        System.out.println("Left function 2");
    }
}

class Operation3{
    void function3() throws Exception{
        Operation2 op2 = new Operation2();
        op2.function2();
        System.out.println("Left function 3");
    }
}

class Operation4{
    void function4() throws  Exception{
        Operation3 op3 = new Operation3();
        op3.function3();
        System.out.println("Left function 4");
    }
}



public class OperationStart {
    public static void main(String[] args) throws Exception {
        Operation4 op4 = new Operation4();
        op4.function4();
        System.out.println("Left main");
    }
}

//output=Inside func 1
//enter num 1
//2
//enter num 2
//1
//2
//left fuction 1
//Left function 2
//Left function 3
//Left function 4
//Left main

//output2=Inside func 1
enter num 1
2
enter num 2
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at www.Exception.www.Operation1.function1(OperationStart.java:14)
	at www.Exception.www.Operation2.function2(OperationStart.java:22)
	at www.Exception.www.Operation3.function3(OperationStart.java:30)
	at www.Exception.www.Operation4.function4(OperationStart.java:38)
	at www.Exception.www.OperationStart.main(OperationStart.java:48)
*/

/*
import java.util.InputMismatchException;
import java.util.Scanner;

class Operation1 {
    void function1() throws Exception {
        System.out.println("Inside func 1");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter num 1:");
            int num1 = sc.nextInt();
            System.out.println("Enter num 2:");
            int num2 = sc.nextInt();

            int res = num1 / num2;
            System.out.println("Result: " + res);
        }  catch (Exception e) {
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("Left function 1");
            
        }
    }
}

class Operation2 {
    void function2() {
        try {
            Operation1 op1 = new Operation1();
            op1.function1();
        } catch (Exception e) {
            System.out.println("Exception caught in function2");
        } finally {
            System.out.println("Left function 2");
        }
    }
}

class Operation3 {
    void function3() {
        try {
            Operation2 op2 = new Operation2();
            op2.function2();
        } catch (Exception e) {
            System.out.println("Exception caught in function3");
        } finally {
            System.out.println("Left function 3");
        }
    }
}

class Operation4 {
    void function4() {
        try {
            Operation3 op3 = new Operation3();
            op3.function3();
        } catch (Exception e) {
            System.out.println("Exception caught in function4");
        } finally {
            System.out.println("Left function 4");
        }
    }
}
class Operation5{
	void fun4() {
        Operation4 op4 = new Operation4();
        op4.function4();
	}
}

public class OperationStart {
    public static void main(String[] args) {
        try {
            Operation5 op5 = new Operation5();
            op5.fun4();
        } catch (Exception e) {
            System.out.println("Exception caught in main");
        } finally {
            System.out.println("Left main");
        }
    }
}

output=Inside func 1
Enter num 1:
2
Enter num 2:
0
Arithmetic Exception
Left function 1
Left function 2
Left function 3
Left function 4
Left main

*/