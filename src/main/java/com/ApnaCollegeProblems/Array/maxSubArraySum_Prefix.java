package com.ApnaCollegeProblems.Array;
import java.util.*;

public class MaxSubarraySum_Prefix {

    // Method to find the maximum subarray sum using the prefix sum approach
    public static void maxSubarraySumPrefix(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int curr =0;

        int prefix[] = new int [numbers.length];
        prefix[0] = numbers[0];
        for (int i =1;i<numbers.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for (int i =0; i<numbers.length; i++0) {
            for (int j=i; j<numbers.length; j++) {
                if (i == 0) {
                    curr = prefix[];
                }
            }
        }
        
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySumPrefix(numbers);
    }
}