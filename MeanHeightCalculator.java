/*Create a program to find the mean height of players present in a football team. */

import java.util.*;
public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11]; 
        double sum = 0; 

        System.out.println("Enter the heights of 11 football players (in cm):");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println("\nMean height of the football team = " + mean + " cm");

    }
}

    

