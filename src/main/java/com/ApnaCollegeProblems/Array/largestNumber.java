package com.ApnaCollegeProblems.Array;
import java.util.*;

public class largestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,4,2,6,8,2,9};
        int largest = getLargest(numbers);
        System.out.println("largest Number in the Numbers:"+ largest);
    }
    
}
