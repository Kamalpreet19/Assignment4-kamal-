/*Write a program to take user input for the age of all 10 students in a class and check 
whether the student can vote depending on his/her age is greater or equal to 18. */
import java.util.*;
public class VoteEligibility{
    Scanner sc=new Scanner(System.in);

    void eligible(){

        int age[]=new int[10];
        System.out.println("Enter ages of 10 students:");
        for(int i=0; i<10 ; i++){
            age[i]=sc.nextInt();
        }

        System.out.println("Eligibility Results:");
        for(int i=0;i<10;i++){
        if(age[i]>=18){
            System.out.println("Student " + (i+1) + " with age " + age [i] + " is Eligible to vote");
        }
        else{
            System.out.println("Student " + (i+1) + " with age " + age[i] + " is Not eligible to vote");
        }
    }
}
    public static void main(String args[]){
        VoteEligibility obj=new VoteEligibility();
        obj.eligible();
    }
}