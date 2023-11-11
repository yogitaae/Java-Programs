//Iterative Method

package assignment_programs;
import java.util.Scanner;

public class IterativeFactorial {
    public static long Factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter a number to calculate its factorial: ");
    	int number = sc.nextInt();

    	long factorial = Factorial(number);
        System.out.println("\nFactorial of " + number + " is: " + factorial);
        
        sc.close();
    }
}

