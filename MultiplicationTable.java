//Create a program to print a multiplication table of a number.
import java.util.*;
public class MultiplicationTable {
    Scanner sc=new Scanner(System.in);
    

    void table(){
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int myArray[]=new int[10];
        for(int i=0;i<10;i++){
            myArray[i]=num*(i+1);
        }
            
            System.out.println("Multiplication table of " + num + " is: ");
            for(int i=0;i<10;i++){
                System.out.println(num + " * " + (i+1) + " = " + myArray[i]);

            }
            
        
    }
    public static void main(String args[]){
        MultiplicationTable obj=new MultiplicationTable();
        obj.table();
    }


    }

    

