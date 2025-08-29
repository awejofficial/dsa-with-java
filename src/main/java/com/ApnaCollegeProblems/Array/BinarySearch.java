package com.ApnaCollegeProblems.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static int BinarySearch(int numbers[], int key) {
        int start =0, end =numbers.length-1;
        while(start <= end) {
            int mid = (start + end ) / 2; 
            //comparison
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid]< key) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
         // This array must be sorted for binary search to work
         int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
         int key1 = 23;
         int key2 = 10;
 
         System.out.println("The index of " + key1 + " is: " + BinarySearch(numbers, key1)); // Expected: 5
         System.out.println("The index of " + key2 + " is: " + BinarySearch(numbers, key2)); // Expected: -1
    }
    
}
