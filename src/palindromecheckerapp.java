import java.util.Scanner;

// ✅ Service class (Encapsulation)
class PalindromeChecker {

    // ✅ Method to check palindrome
    public boolean checkPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

// ✅ Main application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ✅ Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // ✅ Use service class
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(text);

        // ✅ Output
        if (result) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }

        sc.close();
    }
}
