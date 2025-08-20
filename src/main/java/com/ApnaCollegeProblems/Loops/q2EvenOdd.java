package com.ApnaCollegeProblems.Loops;
import java.util.*;

public class q2EvenOdd {
    //Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int numbers;
        int choice;
        int evensum=0;
        int oddsum=0;
        
        do{
        System.out.println("Enter The Set of Integers:");
        numbers= sc.nextInt();

        if(numbers %2==0){
            evensum+=numbers;
            System.out.println("Even Sum is:"+evensum);

        }else{
           oddsum+=numbers;
           System.out.println("Odd Sum i:"+oddsum);
        }
        System.out.println("Do you Wna to Coninue if Yes Press 1 or For no Press 0");
        choice =sc.nextInt();


        }while(choice==1);

        System.out.println("Even Sum Is: "+evensum);
        System.out.println("Odd Sum Is: "+oddsum);
    }

    
}
