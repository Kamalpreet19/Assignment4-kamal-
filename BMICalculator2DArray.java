/*Rewrite the above program using multi-dimensional array to store height, weight, and 
BMI in 2D array for all the persons */

import java.util.*;
public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");

            System.out.print("Enter height in meters: ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            double bmi = personData[i][2];
            if (bmi <= 18.4)
                weightStatus[i] = "Underweight";
            else if (bmi <= 24.9)
                weightStatus[i] = "Normal";
            else if (bmi <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\nHeight(m)  Weight(kg)  BMI   Status");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][0] + "   " + personData[i][1] + "   " + personData[i][2] + "   " + weightStatus[i]);
        }
    }
}
