package www.com.program.string;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String alphabets = "";
        String numbers = "";
        String specialChars = "";
        int sumOfalphabets=0;
        int sumOfnumbers=0;
        int sumOfspecialChars=0;
        int totalCount=0;

        for(int i=0;i<str.length();i++) {
        	
        	if(str.charAt(i)>='A' && str.charAt(i)>='Z' || str.charAt(i)>='a' && str.charAt(i)>='z') {
        		
        		alphabets=alphabets+(char) (str.charAt(i));
        		sumOfalphabets=sumOfalphabets+str.charAt(i);
        		
        	}
        	else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
        		numbers=numbers+(char)(str.charAt(i));
        		sumOfnumbers=sumOfnumbers+str.charAt(i);
        		
        	}
        	else {
        		specialChars=specialChars+(char)(str.charAt(i));
        		sumOfspecialChars=sumOfspecialChars+str.charAt(i);
        	}
        }
        totalCount=sumOfnumbers+sumOfspecialChars+sumOfalphabets;

        System.out.println("Alphabets: " + alphabets);
        System.out.println("SumOfalphabets : "+sumOfalphabets);
        System.out.println("===============================");
        System.out.println("Numbers: " + numbers);
        System.out.println("sumOfnumbers : "+sumOfnumbers);
        System.out.println("===============================");
        System.out.println("specialChars : "+specialChars);
        System.out.println("sumOfspecialChars : " +sumOfspecialChars);
        System.out.println("===============================");
        System.out.println("totalCount "+totalCount);
        

        sc.close();
    }
}
