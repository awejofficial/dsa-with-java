package com.ApnaCollegeProblems.Array;

public class Max_SubArraySum_Kadane {
    public static void kadanes(int numbers[]) {
        int cs =0;
        int ms =Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            cs= cs+ numbers[i];
            if (cs<0) {
                cs = 0;
            }
            ms=Math.max(cs, ms);            
        }
        // The print statement should be outside the loop to print the final maximum sum.
        System.out.println("Our Max Subarray sum is: "+ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        kadanes(numbers);
    }
}
