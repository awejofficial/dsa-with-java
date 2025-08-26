package com.ApnaCollegeProblems.PatternPt2;

public class palindromPyrammid {
    public static void palindromPyramid (int n){
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
       palindromPyramid(8);
    }
}
