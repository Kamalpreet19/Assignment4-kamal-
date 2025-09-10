/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and 
Copy the 2D Array into a single dimension array*/

import java.util.*;
public class TwoDArrayConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements in 1D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}

