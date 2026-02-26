import java.util.*;

class PalindromeService {

    // Encapsulated palindrome logic
    public boolean checkPalindrome(String input) {

        // Normalize string (optional enhancement)
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = input.length() - 1;

        // Two-pointer comparison
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Object creation
        PalindromeService service = new PalindromeService();

        boolean isPalindrome = service.checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}