package com.ApnaCollegeProblems.Day2;
import java.util.*;

public class OperatorBasics {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // System.out.println(10 + 20);
    int a =10;
    int b= 20;
    //Basic Arithmatic Operations
    System.out.println("Addition: "+(a+b));
    System.out.println("Substraction: "+(a-b));
    System.out.println("Product: "+(a*b));
    System.out.println("Division: "+(a%b)); //Used the Modulo For Division (%) Use this for the division
    //Unary Operator In Arithmatic Operator
    int c= a++; // Post Increment 
    System.out.println("Before A Value is : "+a+",Second Value of a With the (a++) is : "+c);
    int d= ++a ; //Pre Increament
    System.out.println("Before A Value is : "+a+",Second Value of a With the (++a) is : "+d);


    }
}
