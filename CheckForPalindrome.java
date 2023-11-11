package assignment_programs;

import java.util.Scanner;

public class CheckForPalindrome {

    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lower-case
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare the original string with its reverse
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string or number to check for palindrome: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }

        scanner.close();
    }
}
