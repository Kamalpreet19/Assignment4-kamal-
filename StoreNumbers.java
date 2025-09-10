/*Write a program to store multiple values in an array up to a maximum of 10 
or until the user enters a 0 or a negative number. Show all the numbers as well 
as the sum of all numbers */

import java.util.*;
public class StoreNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];  
        int sum = 0;                 
        int count = 0;            

        System.out.println("Enter up to 10 positive numbers (0 or negative to stop):");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (numbers[i] <= 0) { 
                break;
            }

            sum += numbers[i]; 
            count++; 
        }

       
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nSum of all numbers: " + sum);

        sc.close();
    }
}


