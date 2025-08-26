package com.ApnaCollegeProblems.PatternPt2;

public class number_pyramid {
    public static void numberPyramid (int n) {
        //Outer-Loop for the lines to print
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        numberPyramid(8);

    }    
}

