/*Rework the program 2, especially the Hint f where if index equals maxDigit, we break 
from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 
10 if the index is equal to maxDigit. This is done to consider all digits to find the 
largest and second-largest number   */

import java.util.*;
public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxDigit = 10;  
        int[] digits = new int[maxDigit];
        int index = 0;

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int tempNum = number;

        while (tempNum != 0) {
            if (index == maxDigit) { 
                maxDigit += 10; 
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp; 
            }

            digits[index] = tempNum % 10; 
            tempNum = tempNum / 10;       
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
