/*Create a program to find the bonus of 10 employees based on their years of service and 
the total bonus amount the company Zara has to pay, along with the old and new salary.*/


import java.util.*;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; 

        double[] salaries = new double[n];       
        double[] years = new double[n];          
        double[] bonuses = new double[n];        
        double[] newSalaries = new double[n];    

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            while (true) {
                System.out.print("Enter salary: ");
                salaries[i] = sc.nextDouble();
                if (salaries[i] > 0) break;
                System.out.println("Salary must be positive. Enter again.");
            }

            while (true) {
                System.out.print("Enter years of service: ");
                years[i] = sc.nextDouble();
                if (years[i] >= 0) break;
                System.out.println("Years of service cannot be negative. Enter again.");
            }
        }

        for (int i = 0; i < n; i++) {
            if (years[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; 
            } else {
                bonuses[i] = salaries[i] * 0.02; 
            }

            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nEmployee-wise Bonus and New Salary:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] +", Bonus = " + bonuses[i] + ", New Salary = " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}

