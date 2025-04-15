package www.Exception.www;

import java.util.Scanner;

// Custom Exception for UnderAge
class UnderAgeException extends Exception {
    public String getMessage() {
        return "The specified age is below minimum age, please try again later.";
    }
}

// Custom Exception for OverAge
class OverAgeException extends Exception {
    public String getMessage() {
        return "The specified age is beyond the maximum age, please try again later.";
    }
}

// Candidate class for data collection and validation
class Candidate {
    int age;

    void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age = sc.nextInt();
    }

    void verify() throws Exception {
        if (age < 18) {
            throw new UnderAgeException();
        } else if (age > 60) {
            throw new OverAgeException();
        } else {
            System.out.println("Valid age.");
        }
    }
}

// RTO class to validate candidate with multiple attempts
class RTO {
    void validateCandidate(Candidate c) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                c.collectData();
                c.verify();
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                attempts++;
            }
        }
        System.out.println("User blocked.");
        System.exit(0);
    }
}

// Main Application class
public class MainApp {
    public static void main(String[] args) {
        RTO rto = new RTO();
        Candidate c = new Candidate();
        rto.validateCandidate(c);
    }
}
