package com.ApnaCollegeProblems.Array;

public class Array1 {
    public static void update (int marks[]) {
        int nonChangeble = 10;
        for ( int i=0; i<marks.length; i++) {
            marks[i] = marks[i]+1;
        }
        }
        public static void main(String args[]) {
            int marks[] = {67,78,89};
            int nonChangeble = 5;
            update(marks);
            // for printing the Array
            for(int i=0; i<marks.length;i++) {
                System.out.print(marks[i]+" ");
              
            }
            System.out.println("Non Changeble:"+ nonChangeble);
    }
}
