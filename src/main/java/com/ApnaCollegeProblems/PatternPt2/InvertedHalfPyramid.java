package com.ApnaCollegeProblems.PatternPt2;

public class InvertedHalfPyramid {
    public static void InvHalfPyramid(int n) {
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // New line after each row
            System.out.println();
        }
    }

    public static void main(String args[]) {
        InvHalfPyramid(4);
    }
}