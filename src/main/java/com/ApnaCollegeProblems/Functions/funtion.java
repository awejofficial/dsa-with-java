package com.ApnaCollegeProblems.Functions;
import java.util.*;

public class funtion {
    //Functions WIth the Parameters
    // public static int calculateSum(int num1, int num2){
    //     int sum = num1 + num2; // Use parameter names, not a+b
    //     return sum;
    //}
    public static int multiply(int num1, int num2){
        int product =num1*num2;
        return product;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int sum = calculateSum(a, b); // Correct method name spelling
        int product= multiply(a,b);
        System.out.println("Product of numbers is: " +product ); // Print the actual sum
        sc.close(); // Close scanner to prevent resource leak
    }
}
