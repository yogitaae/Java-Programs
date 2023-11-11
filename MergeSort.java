package assignment_programs;
import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(int[] array) 
    {
        if (array.length > 1) 
        {
            int mid = array.length / 2;

            int[] left = new int[mid];
            System.arraycopy(array, 0, left, 0, mid);

            int[] right = new int[array.length - mid];
            System.arraycopy(array, mid, right, 0, array.length - mid);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) 
    {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) 
        {
            if (left[i] <= right[j]) 
            {
                array[k++] = left[i++];
            } 
            else 
            {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) 
        {
            array[k++] = left[i++];
        }

        while (j < right.length) 
        {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("\nEnter " + size + " elements for the array:");

        for (int i = 0; i < size; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("\nOriginal Array: ");
        printArray(array);

        mergeSort(array);

        System.out.print("Sorted Array: ");
        printArray(array);

        scanner.close();
    }

    private static void printArray(int[] array) 
    {
        for (int num : array) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
