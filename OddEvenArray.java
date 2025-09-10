/*Create a program to save odd and even numbers into odd and even arrays between 1 to the 
number entered by the user. Finally, print the odd and even numbers array */


import java.util.*;
public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }

        int[] even = new int[num];
        int[] odd = new int[num];
        int e = 0, o = 0; 

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
               even[e] = i;
               e = e + 1;    
            } else {
               odd[o] = i;
               o = o + 1;    
            }
        }
    
        System.out.print("Even Numbers: ");
        for (int i = 0; i < e; i++) {
            System.out.print(even[i] + " ");
        }

        // Print odd numbers
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < o; i++) {
            System.out.print(odd[i] + " ");
        }

    }
}

 