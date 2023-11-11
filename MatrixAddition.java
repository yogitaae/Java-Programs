package assignment_programs;
import java.util.Scanner;

public class MatrixAddition 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get user input for matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create matrices
        int[][] matrixA = readMatrix("A", rows, columns, scanner);
        int[][] matrixB = readMatrix("B", rows, columns, scanner);

        // Perform matrix addition
        int[][] resultMatrix = addMatrices(matrixA, matrixB);

        // Display the result
        displayMatrix(resultMatrix);

        scanner.close();
    }

    private static int[][] readMatrix(String matrixName, int rows, int columns, Scanner scanner) 
    {
        System.out.println("\nEnter elements for Matrix " + matrixName + ":\n");
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) 
    {
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return resultMatrix;
    }

    private static void displayMatrix(int[][] matrix) 
    {
        System.out.println("\nResultant Matrix:");
        for (int[] row : matrix) 
        {
            for (int element : row) 
            {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}

