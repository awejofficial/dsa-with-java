package com.ApnaCollegeProblems.Functions;
//Function Overloading:
// Multiple Function with the same name diffrent Parameters.
// Function overloading only happens in the Parameters. not the name of the function.

public class FunOverloading {
    public static int sum (int a, int b) {//using the parameters.
        return a+b;
    }
    public static int sum (int a, int b, int c) {//Using the paremeters
        return  a+b+c;
    }
    public static float sum(float  a, float  b) {// using the datatypes
        return a+b;
    }
    public static double sum(double a, double b) { //using the datatypes
        return a+b;

    } 
    public static int sum(int a, int b) {//using the datatypes
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,4));
        
        System.out.println(sum(5,5));
        System.out.println(sum(8.0,45.5));

        

        

    }
}
