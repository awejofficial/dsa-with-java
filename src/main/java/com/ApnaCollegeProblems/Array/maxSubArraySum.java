package com.ApnaCollegeProblems.Array;

public class maxSubArraySum {
    public static void maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        
        // Outer loop for the starting point
        for (int i = 0; i < numbers.length; i++) {
            // Middle loop for the ending point
            for (int j = i; j < numbers.length; j++) {
                int currSum = 0; // The fix: reset currSum for each subarray
                
                // Inner loop to calculate the sum of the subarray from i to j
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                System.out.println("Sum of subarray from " + i + " to " + j + " is: " + currSum);
                
                // Update the maximum sum if the current subarray sum is greater
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum of the Subarray is: " + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        maxSubarraySum(numbers);
    }
    
}
