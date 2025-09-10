/*Create a program to find the factors of a number taken as user input, store the 
factors in an array, and display the factors */

import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = new int[num];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        System.out.print("Factors of " + num + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

    }
}

    
