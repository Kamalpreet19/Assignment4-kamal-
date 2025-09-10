/*Create a program to take a number as input find the frequency of each digit 
in the number using an array and display the frequency of each digit */

import java.util.*;
public class DisplayDigitFrequency {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number;
        }

        int[] freq = new int[10];

        int temp = number;
        if (temp == 0) {
            freq[0] = 1; 
        }
        while (temp > 0) {
            int digit = temp % 10; 
            freq[digit]++;         
            temp /= 10;            
        }

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }

}
