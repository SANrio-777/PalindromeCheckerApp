import java.util.*;

import static java.util.Collections.reverse;

public class PalindromeCheckerApp {

    // Node class
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        Node head = null;
        Node tail = null;

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the Linked list
        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        // Find middle using Fast & Slow pointers
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);

        // Compare both halves
        Node firstHalf = head;
        Node tempSecond = secondHalf;

        // Flag to track palindrome state
        boolean isPalindrome = true;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome. ");
        } else {
            System.out.println("The string is not a palindrome. ");
        }
    }
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;

        }
    }
