/*An organization took up an exercise to find the Body Mass Index (BMI) of all the persons 
in the team. For this create a program to find the BMI and display the height, weight, BMI 
and status of each individual */


import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight in kg: ");
            weight[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("Height(m)  Weight(kg)  BMI  Status");
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + "   " + weight[i] + "   " + bmi[i] + "   " + status[i]);
        }
    }
}
