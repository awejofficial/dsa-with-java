package com.ApnaCollegeProblems.PatternPt2;

public class SolidRhombus {
    public static void Rhombus(int n) {
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
    
            // Inner loop for leading spaces
            // The number of spaces decreases with each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
    
            // Inner loop for stars (always n stars for a solid rhombus)
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
    
            System.out.println(); // Move to the next line
        }
    }
    public static void  main(String s[]) {
        Rhombus(50);
    }
}