/*Write a program FizzBuzz, take a number as user input and if it is a positive integer
 loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead 
 of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". 
 Finally, print the array results for each index position in the format Position 1 = 1, …, 
 Position 3 = Fizz,... */

import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer!");
            return;
        }

        String[] results = new String[n];

        for (int i = 0; i < n; i++) {
            int number = i + 1; 
            if (number % 3 == 0 && number % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (number % 3 == 0) {
                results[i] = "Fizz";
            } else if (number % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(number);
            }
        }
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }
    }
}
    

