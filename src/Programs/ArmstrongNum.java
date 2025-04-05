package Programs;
import java.util.Scanner;


public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0; 
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number =number/10;
        }

        return sum == originalNumber;
    }
}
