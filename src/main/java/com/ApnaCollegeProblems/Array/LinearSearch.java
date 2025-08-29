package com.ApnaCollegeProblems.Array;

public class LinearSearch {

    // Performs linear search on the given array to find the key.
    // Returns the index of the key if found, otherwise returns -1.
    public static int linearSearch(int numbers[], int key) {
        // Iterate through the array
        for (int i=0; i<numbers.length; i++) {
            // If the current element is equal to the key, return the index
            if (numbers[i] == key) {
                return i;
            }
        }
        // If the key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] ={2,3,4,5,6,7,8,9,20,10};
        int key = 10;
        // Call the linear search function to find the index of the key
        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.println("Not Found");
        }else {
            System.out.println("Key Is at the index:"+index);
        }

    }
}
