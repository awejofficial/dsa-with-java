package com.ApnaCollegeProblems.PatternPt2;

public class Hollow_Rhombus {
    public static void hollow_rhombus(int n) {
        //outer loop- for printing the rows
        for(int i=1; i<=n; i++) {
            //inner loop- for printing the hollow rhombus
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        hollow_rhombus(22);
    }
    
}
