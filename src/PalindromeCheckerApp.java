import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char back = deque.removeLast();

            if(front != back ){
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}