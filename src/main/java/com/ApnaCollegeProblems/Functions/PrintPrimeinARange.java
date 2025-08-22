package com.ApnaCollegeProblems.Functions;

public class PrintPrimeinARange {
    
    public static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimeinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        PrimeinRange(100);
    }
}
