import java.util.*;

import static java.util.Collections.reverse;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Normalize the string
        String normalized = input
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if(normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)){
                isPalindrome = false;
                break;

            }
        }

        // Result
        if(isPalindrome){
            System.out.println("The string is a palindrome. ");
        } else {
            System.out.println("The String is not a palindrome. ");
        }
    }
}