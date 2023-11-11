package assignment_programs;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SameElements 
{

    public static void printCommonElements(int[] array1, int[] array2) 
    {
        // Check for null
        if (array1 == null || array2 == null) 
        {
            System.out.println("Arrays are not equal.");
            return;
        }

        // Use sets to store unique elements from each array
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

        for (int num : array1) 
        {
            set1.add(num);
        }

        for (int num : array2) 
        {
            // If the element is already in set1, it's a common element
            if (set1.contains(num)) 
            {
                commonElements.add(num);
            }
        }

        if (!commonElements.isEmpty()) 
        {
            System.out.println("\nCommon Elements: " + commonElements);
        } 
        else 
        {
            System.out.println("\nNo common elements found.");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];

        System.out.println("Enter " + size1 + " elements for the first array:\n");

        for (int i = 0; i < size1; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Get user input for the second array
        System.out.print("\nEnter the size of the second array: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];

        System.out.println("Enter " + size2 + " elements for the second array:");

        for (int i = 0; i < size2; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Print common elements
        printCommonElements(array1, array2);

        scanner.close();
    }
}

