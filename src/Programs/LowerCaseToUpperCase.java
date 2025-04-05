package Programs;
public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        String str = "java programming";
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result.append((char) (c - 32)); // Convert to uppercase manually
            } else {
                result.append(c);
            }
        }

        System.out.println("Converted String: " + result);
    }
}
