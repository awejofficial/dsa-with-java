package com.ApnaCollegeProblems.Functions;

public class q2isEven {
    public static boolean isEven(int n) {

        boolean isEven = true;
        if(n%2==0){
            isEven = true;
            
        }else{
            isEven = false;
        }
        return isEven;
    }
    public static void main(String args []) {
        System.out.println(isEven(2));
    }
    
    
}
