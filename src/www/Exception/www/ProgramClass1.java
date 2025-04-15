package www.Exception.www;


import java.util.Scanner;
import java.util.stream.Stream;

class UserNameException1 extends  Exception{
   public String getMessage(){
       return "Invalid username";
   }
}

class PasswordException1 extends Exception{
    public String getMessage(){
        return "Invalid password";
    }}

class User1{
    String userName;
    String password;

    void collect(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        userName = sc.next();
        System.out.println("enter password");
        password = sc.next();
    }
}

public class ProgramClass1 {
    String userName = "user";
    String password = "12345678";

    public static void main(String[] args)throws Exception {
        ProgramClass1 p = new ProgramClass1();
        User1 u = new User1();
        p.auth(u);

    }

    void auth(User1 u)throws Exception{
        u.collect();
        if(!userName.equals(u.userName)){
            UserNameException1 ue = new UserNameException1();
            System.out.println(ue.getMessage());
            throw ue;
        } else if (!password.equals(u.password)) {
            PasswordException1 pe = new PasswordException1();
            System.out.println(pe.getMessage());
            throw pe;
        }else{
            System.out.println("user verified");
        }

    }
}