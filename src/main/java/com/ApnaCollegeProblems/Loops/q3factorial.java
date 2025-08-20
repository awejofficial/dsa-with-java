package com.ApnaCollegeProblems.Loops;
import java.util.*;

public class q3factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        long fact;
        System.out.println("Enter A Non _negative No:");
        n =sc.nextInt();

        if( n<0){
            System.out.println("Enter A valdi no:");

        }else{
            fact=1;
            for(int i=1;i<=n;i++){
                fact *=i;
            }
            System.out.println("Factorial Of a Given No Is:"+fact);
        }

    }    
}
