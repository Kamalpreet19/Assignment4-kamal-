/*Write a program to take user input for 5 numbers and check whether a number is positive,  
negative, or zero. Further for positive numbers check if the number is even or odd. Finally
compare the first and last elements of the array and display if they equal, greater or less*/
import java.util.*;
public class NumberCheck {
    Scanner sc=new Scanner(System.in);
    int num[]=new int[5];

    void check(){
        System.out.print("Enter number:");
        for (int i=0; i<5; i++){
          num[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
        if(num[i]>0){
            System.out.println("Number " + num[i] + " is positive");
            if (num[i]%2==0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is odd");
            }
        }
        else if(num[i]<0){
            System.out.println("Number " + num[i] + " is negative");
        }
        else{
            System.out.println("Number " + num[i] + " is zero");
        }
    }
    }

    void compare(){
      
        int first=num[0];
        int last=num[4];
        
        if(first==last){
            System.out.println("First number is equal to last number");
        }
        else if(first>last){
            System.out.println("First number is greater than the last number");
        }
        else{
            System.out.println("Last number is greater than the first number");
        }
    }
    
    public static void main(String args[]){
        NumberCheck obj=new NumberCheck();
        obj.check();
        obj.compare();
    }
    
}
