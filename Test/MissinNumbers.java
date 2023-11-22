package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int arrsize = scanner.nextInt();

        int[] arrayy = new int[arrsize]; 

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arrsize; i++) {
            arrayy[i] = scanner.nextInt();
        }

        Arrays.sort(arrayy);
        
        for(int i = 0; i < arrsize; i++) {
        	if(arrayy[i]!=i) {
        		System.out.println("Missing number: "+i);
        		break;
        	}
        }
        scanner.close();
    }
}
