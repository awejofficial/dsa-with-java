package com.ApnaCollegeProblems.Functions;

public class q1avgof3 {
    //Question 1: Write a java method to compute average of three no

    public static int average(int a, int b, int c) {
        int sum= a+b+c;
        int count = 3;
        return sum/count;
    }
    public static void main (String args []) {
        System.out.println(average(4,7,9));
    }
    
}
