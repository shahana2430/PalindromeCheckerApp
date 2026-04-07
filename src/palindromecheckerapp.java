import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ✅ Take input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // ✅ Convert to char array
        char[] arr = text.toCharArray();

        // ✅ Two-pointer technique
        int left = 0;
        int right = arr.length - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        // ✅ Display result
        if (isPalindrome) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }

        sc.close();
    }
}

