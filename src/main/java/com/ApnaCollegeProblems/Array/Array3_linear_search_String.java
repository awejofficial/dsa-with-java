package com.ApnaCollegeProblems.Array;

public class Array3_linear_search_String {
        public static int findString(String words[], String key) {
            for(int i=0; i<words.length; i++) {
                if(words[i].equalsIgnoreCase(key)) {
                    return i;
                }
            }
            return -1;
        }
    
        public static void main(String[] args) {
            String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
            String key1 = "banana";
            String key2 = "grape";
            
            int index1 = findString(fruits, key1);
            int index2 = findString(fruits, key2);
    
            System.out.println("The index of '" + key1 + "' is: " + index1); // Expected: 1
            System.out.println("The index of '" + key2 + "' is: " + index2); // Expected: -1
        }
}
    
