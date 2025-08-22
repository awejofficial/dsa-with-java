package com.ApnaCollegeProblems.Functions;

public class PrimeOrNot {
    public static boolean IsPrime(int n) {
        boolean isPrime = true;
        

        for (int i=2; i<=n-1; i++) {
            if(n%i==0) {// Completely Dividing
                isPrime = false;
                break;
            }
        }
        return isPrime;
        
    }
    public static void main(String args[]){
        
        System.out.println(IsPrime(8));
    }
    
}
