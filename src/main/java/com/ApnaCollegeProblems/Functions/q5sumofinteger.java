package com.ApnaCollegeProblems.Functions;

import java.util.Scanner;

// This class calculates the sum of the digits of an integer entered by the user.
public class q5sumofinteger {

    // This method calculates the sum of the digits of a given integer.
    public static int sumofDigit(int n) {
        // Initialize a variable to store the sum of the digits.
        int sumofDigit = 0;

        // Loop through the digits of the number.
        // The loop continues as long as the number is greater than 0.
        while (n > 0) {
            // Get the last digit of the number using the modulo operator (%).
            int lastDigit = n % 10;
            // Add the last digit to the sum.
            sumofDigit += lastDigit;
            // Remove the last digit from the number by dividing it by 10.
            n /= 10;
        }
        // Return the calculated sum of digits.
        return sumofDigit;
    }

    // The main method where the program execution begins.
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user.
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter a number.
        System.out.println("Enter the Digits:");
        // Read the integer entered by the user.
        int digits = sc.nextInt();
        // Call the sumofDigit method to calculate the sum of the digits
        // and print the result.
        System.out.println("Sum Of the Digits:" + sumofDigit(digits));
    }
}
