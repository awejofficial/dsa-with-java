package com.ApnaCollegeProblems.Array;
import java.util.*;

public class Smallest_Largest_Numbers {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,4,2,6,8,2,9};
        int largest = getLargest(numbers);
        int smallest = getSmallest(numbers);
        System.out.println("largest Number in the Numbers:"+ largest);
        System.out.println("Smallest Number in the Numbers:"+ smallest);
    }
    
}
