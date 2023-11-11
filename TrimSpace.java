package assignment_programs;

import java.util.Scanner;

public class TrimSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string to remove leading and trailing spaces: ");
        String stringWithSpaces = scanner.nextLine();

        // Using trim() to remove leading and trailing spaces
        String trimmedString = stringWithSpaces.trim();

        System.out.println("Original String: '" + stringWithSpaces + "'");
        System.out.println("Trimmed String: '" + trimmedString + "'");

        scanner.close();
    }
}

