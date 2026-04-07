import java.util.*;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ✅ Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // ✅ Create Deque
        Deque<Character> deque = new LinkedList<>();

        // ✅ Insert characters into deque
        for (int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }

        // ✅ Compare front and rear
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // ✅ Result
        if (isPalindrome) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }

        sc.close();
    }
}


