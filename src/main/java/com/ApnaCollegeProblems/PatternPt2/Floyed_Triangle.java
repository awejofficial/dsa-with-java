package com.ApnaCollegeProblems.PatternPt2;

public class Floyed_Triangle {
    public static void FloyedTriangle (int n) {
        int counter =1;
        for (int i=1; i<=n; i++) {
            //inner loop - how many times should no will be printed
            for(int j=1; j<=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        FloyedTriangle(5);
    }
    
}
