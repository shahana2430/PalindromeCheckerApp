import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ✅ Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // ✅ Normalize string (remove spaces & convert to lowercase)
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        // ✅ Check palindrome using two-pointer
        int left = 0;
        int right = normalized.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // ✅ Output
        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a Palindrome (ignoring case & spaces)");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome");
        }

        sc.close();
    }
}

