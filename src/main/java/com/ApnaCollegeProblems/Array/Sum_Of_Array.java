package com.ApnaCollegeProblems.Array;

import java.util.Arrays;

public class Sum_Of_Array {
    public static void Sum_Of_Array(int numbers[]) {
        int sum =0;
        for(int i=0; i<numbers.length;i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum Of the Array is:"+sum);
    }
    public static int FindAvg(int numbers[]) {
        int sum = 0;
        int avg = 0;
        for(int i=0; i<numbers.length;i++) {
            sum = sum +numbers[i];
             avg =(sum/numbers.length);
        }
       System.out.println("Average Of the Array is:"+avg);
        return avg;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        System.out.println("The array is: " + Arrays.toString(numbers));
        Sum_Of_Array(numbers);
        FindAvg(numbers);
        
    }
}