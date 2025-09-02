package com.ApnaCollegeProblems.Array;

public class Print_Subarray {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currentSum = 0;
                // Print subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    currentSum += numbers[k];
                }
                System.out.println("- Sum: " + currentSum); // Optional: print sum of current subarray

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays: " + ts);
        System.out.println("Max Sum OF the Subarray is: " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printSubarrays(numbers);
    }
}
