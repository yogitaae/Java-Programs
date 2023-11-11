package assignment_programs;

public class IsStringImmutable {
    public static void main(String[] args) {
        String originalString = "Hello, World!";

        // Demonstrating immutability
        String modifiedString = originalString.concat(" How are you?");

        // Print the original and modified strings
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        // Check if the original string is unchanged
        System.out.println("\nOriginal String is unchanged: " + (originalString == modifiedString));
    }
}
