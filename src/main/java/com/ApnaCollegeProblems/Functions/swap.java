package com.ApnaCollegeProblems.Functions;

public class swap {

    public static void swap(int a, int b){
        
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:"+"A:"+a+"B: "+b);

    }
    public static void main(String args[]){
        int a=1;
        int b=10;
        swap(a,b);
    }
    
}
