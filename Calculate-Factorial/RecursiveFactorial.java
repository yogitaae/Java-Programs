// How can you find the factorial of an integer in Java?
// Recursive Method

package assignment_programs;
import java.util.Scanner;

public class RecursiveFactorial 
{
    public static long calculateFactorialRecursive(int n) 
    {
        if (n < 0) 
        {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        if (n == 0 || n == 1) 
        {
            return 1;
        }

        return n * calculateFactorialRecursive(n - 1);
    }

    public static void main(String[] args) 
    {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter a number to calculate its factorial: ");
    	int number = sc.nextInt();

    	long factorial = calculateFactorialRecursive(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        sc.close();
    }
}
