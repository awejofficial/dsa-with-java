package com.ApnaCollegeProblems.PatternPt2;

public class hollowRect { // Dry  Run Requires
    public static int HollowRect(int totRows, int totColumn) {
        for(int i=1; i<=totRows; i++) {// Outer Loop For the Total rows
            for(int j=1; j<=totColumn; j++) { // Inner Loop Fot the Total Columns
                if(i==1 || i==totRows || j==1 || j==totColumn) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String args[]){
        System.out.println(HollowRect(5,9));
    }
    
}
