/*Create a program to store the digits of the number in an array and find the largest 
and second largest element of the array. */

import java.util.*;
public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxDigit = 10;  
        int[] digits = new int[maxDigit];
        int index = 0;

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        
        while (temp != 0 && index < maxDigit) {
            digits[index] = temp % 10;  
            temp = temp / 10;           
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
    
}
