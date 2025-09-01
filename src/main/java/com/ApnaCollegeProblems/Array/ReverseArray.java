package com.ApnaCollegeProblems.Array;

public class ReverseArray {
    public static void reverse (int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while(first < last) {
            // Swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6};

        reverse(numbers);

        // This is the correct way to print the reversed array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}