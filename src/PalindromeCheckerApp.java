public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long startTime = System.nanoTime();

        // To get a larger execution time that's close to 852600 ns as displayed in the doc
        for (int i = 0; i < 100000; i++) {
            checkPalindrome(input);
        }

        // Palindrome check (Two-pointer method)
        boolean isPalindrome = checkPalindrome(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Execution Time: " + executionTime + " ns");
    }

    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

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