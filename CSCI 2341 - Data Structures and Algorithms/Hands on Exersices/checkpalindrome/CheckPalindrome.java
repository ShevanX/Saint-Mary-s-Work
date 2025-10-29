import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Programmed by Shevan Walimini: code_for_today");

        if (args.length == 0) {
            System.out.println("Usage:");
            System.out.println("Enter some input on the command line to see if it's a palindrome, and");
            System.out.println("be sure to enclose it in double quotes if it contains any blank spaces.");
            System.out.print("Press Enter to continue ...");
            Scanner sc = new Scanner(System.in);
            sc.nextLine(); // pause until Enter is pressed
            System.out.println();
            return;
        }

        // Combine all command-line arguments into a single string
        StringBuilder inputBuilder = new StringBuilder();
        for (String arg : args) {
            if (inputBuilder.length() > 0)
                inputBuilder.append(" ");
            inputBuilder.append(arg);
        }

        String originalInput = inputBuilder.toString();
        System.out.println(originalInput);

        // Remove all non-letter characters and convert to lowercase
        String cleanedInput = originalInput.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println("becomes");
        System.out.println(cleanedInput);

        // Check palindrome recursively
        if (isPalindrome(cleanedInput)) {
            System.out.println("and is a palindrome.");
        } else {
            System.out.println("and is not a palindrome.");
        }
        System.out.println();
    }

    // Recursive method to check palindrome
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}
