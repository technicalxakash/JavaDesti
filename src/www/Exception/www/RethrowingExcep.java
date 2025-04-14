/*
package www.Exception.www;

import java.util.Scanner;

class Operation11{
    void function()throws Exception{
        try{
            System.out.println("Inside func 1");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter num 1");
            int num1 = sc.nextInt();
            System.out.println("enter num 2");
            int num2 = sc.nextInt();
            int res = num1/num2;
            System.out.println(res);

        }catch (Exception e){
            System.out.println("Exception handled in func1");
            throw  e;
        }
    }
}


public class RethrowingExcep {
    public static void main(String[] args) {
       try {
           Operation11 op1 = new Operation11();
           op1.function();
           
       }catch (Exception e){
           System.out.println("Exception handled in Main");
       }
    }

}

output=Inside func 1
enter num 1
2
enter num 2
0
Exception handled in func1
Exception handled in Main
*/
