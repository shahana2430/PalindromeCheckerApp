import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // ✅ Recursive method
    public static boolean isPalindrome(String str, int left, int right) {

        // ✅ Base condition
        if (left >= right) {
            return true;
        }

        // ❌ If mismatch
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // 🔁 Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ✅ Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // ✅ Call recursive function
        boolean result = isPalindrome(text, 0, text.length() - 1);

        // ✅ Output
        if (result) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }

        sc.close();
    }
}
