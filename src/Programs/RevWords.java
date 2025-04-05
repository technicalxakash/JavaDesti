package Programs;
import java.util.Scanner;
public class RevWords {

	public static void main(String[] args) {
		


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine(); // Read the input sentence

        String[] words = sentence.split(" "); // Split words by space
        String result = "";

        for (String word : words) {
            String reversedWord = reverseWord(word); // Reverse each word
            result += reversedWord + " "; // Append reversed word to result
        }

        System.out.println("Reversed words: " + result.trim());
        sc.close();
    }

    // Function to reverse a word without StringBuilder
    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}


		   


	


