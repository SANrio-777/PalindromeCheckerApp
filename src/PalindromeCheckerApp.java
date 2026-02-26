import java.util.*;

import static java.util.Collections.reverse;

public class PalindromeCheckerApp {
     public static void main(String[] args){
         String input = "madam";
         boolean result = isPalindrome (input, 0, input.length() - 1);

         if (result) {
             System.out.println("The string is a palindrome. ");
         } else {
             System.out.println("The string is not a palindrome. ");
         }
     }

     // Recursive method
    public static boolean isPalindrome(String str, int start, int end){

         // If pointers cross or meet
        if (start >= end){
            return true;
        }

        // If mismatch found
        if (str.charAt(start) != str.charAt(end)){
            return false;
        }
        return isPalindrome(str, start +1, end - 1 );
    }
}