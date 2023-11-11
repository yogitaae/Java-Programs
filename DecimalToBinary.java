package assignment_programs;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the decimal number
        System.out.print("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();

        // Convert decimal to binary and print the result
        System.out.print("Binary representation: ");
        convertAndPrintBinary(decimalNumber);

        scanner.close();
    }

    private static void convertAndPrintBinary(double decimalNumber) {
        // Check if the number is non-negative
        if (decimalNumber < 0) {
            throw new IllegalArgumentException("Decimal number must be non-negative.");
        }

        // Convert decimal to binary
        long integralPart = (long) decimalNumber;
        System.out.print(Long.toBinaryString(integralPart));

        decimalNumber -= integralPart; // Remove the integer part

        // Print the fractional part if it exists
        if (decimalNumber > 0) {
            System.out.print(".");
            printFractionalBinary(decimalNumber);
        }

        System.out.println();
    }

    private static void printFractionalBinary(double fractionalPart) {
        for (int i = 0; i < 10; i++) { // Adjust the precision as needed
            fractionalPart *= 2;
            int bit = (int) fractionalPart;
            System.out.print(bit);
            fractionalPart -= bit;
        }
    }
}
