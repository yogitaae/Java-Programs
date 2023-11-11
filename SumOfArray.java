package assignment_programs;
import java.util.Scanner;

public class SumOfArray {

    public static int getArraySum(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an array based on user input
        int[] numbers = new int[size];

        System.out.println("\nEnter " + size + " integers for the array:");

        // Get user input for each element of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Calculate and print the sum of elements in the array
        int sum = getArraySum(numbers);
        System.out.println("\nSum of elements in the array: " + sum);

        sc.close();
    }
}
