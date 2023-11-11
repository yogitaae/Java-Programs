package assignment_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckForOddNum {

    public static void OddNumbersOnly(List<Integer> numbers) 
    {
    	List<Integer> oddNumbers = new ArrayList<>();
    	List<Integer> evenNumbers = new ArrayList<>();

    	for (int number : numbers) 
    	{
    		if (number % 2 == 0) 
    		{
    			// Even number found
    			evenNumbers.add(number);
    		} 
    		else 
    		{
    			// Odd number found
    			oddNumbers.add(number);
    		}
    }
    	System.out.println("\n---------------------------------\n");
    	System.out.println("Number of odd numbers: " + oddNumbers.size());
    	System.out.println("List of odd numbers: " + oddNumbers);
    	System.out.println("Number of even numbers: " + evenNumbers.size());
    	System.out.println("List of even numbers: " + evenNumbers);
}


    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int listSize = scanner.nextInt();

        List<Integer> myList = new ArrayList<>();

        System.out.println("Enter " + listSize + " integers:\n");

        for (int i = 0; i < listSize; i++) 
        {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int number = scanner.nextInt();
            myList.add(number);
        }

        OddNumbersOnly(myList);
        
        scanner.close();
    }
}
