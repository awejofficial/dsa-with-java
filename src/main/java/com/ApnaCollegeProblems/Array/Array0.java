package com.ApnaCollegeProblems.Array;
import java.util.*;

public class Array0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        
        System.out.println("Enter the Subjets Marks: ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        int avg = (marks[0]+marks[1]+marks[2]+marks[3]) / 4;
        System.out.println("Average of the Student is: "+avg);

    }
}
