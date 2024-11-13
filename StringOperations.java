//set 2
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);

        // Count the number of vowels in the string
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in the string: " + vowelCount);

        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to count the number of vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
