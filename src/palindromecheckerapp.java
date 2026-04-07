import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // ✅ Method 1: String Reverse
    public static boolean checkReverse(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }

    // ✅ Method 2: Two-pointer
    public static boolean checkTwoPointer(String text) {
        int left = 0, right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // ✅ Method 3: Stack
    public static boolean checkStack(String text) {
        Stack<Character> stack = new Stack<>();

        for (char ch : text.toCharArray()) {
            stack.push(ch);
        }

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // 🔵 Reverse Method Timing
        long start1 = System.nanoTime();
        boolean r1 = checkReverse(text);
        long end1 = System.nanoTime();

        // 🟢 Two Pointer Timing
        long start2 = System.nanoTime();
        boolean r2 = checkTwoPointer(text);
        long end2 = System.nanoTime();

        // 🟡 Stack Method Timing
        long start3 = System.nanoTime();
        boolean r3 = checkStack(text);
        long end3 = System.nanoTime();

        // ✅ Display results
        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + r1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Two Pointer: " + r2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Stack Method: " + r3 + " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}


