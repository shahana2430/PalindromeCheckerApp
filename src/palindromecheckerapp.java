import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ✅ Take input from user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // ✅ Reverse string using loop
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // ✅ Compare original and reversed
        if (text.equals(reversed)) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }

        sc.close();
    }
}

