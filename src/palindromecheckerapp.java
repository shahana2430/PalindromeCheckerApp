import java.util.*;

// ✅ Strategy Interface
interface PalindromeStrategy {
    boolean check(String text);
}

// ✅ Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String text) {

        Stack<Character> stack = new Stack<>();

        // Push characters
        for (char ch : text.toCharArray()) {
            stack.push(ch);
        }

        // Compare
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// ✅ Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String text) {

        Deque<Character> deque = new LinkedList<>();

        for (char ch : text.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// ✅ Context Class
class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String text) {
        return strategy.check(text);
    }
}

// ✅ Main Class
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // ✅ Choose strategy dynamically
        PalindromeStrategy strategy;

        System.out.print("Choose method (1-Stack, 2-Deque): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        // ✅ Inject strategy
        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.checkPalindrome(text);

        // ✅ Output
        if (result) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }

        sc.close();
    }
}
        git add .
        git commit -m "UC12:Hardcoded palindrome "
        git push origin feature/UC12
