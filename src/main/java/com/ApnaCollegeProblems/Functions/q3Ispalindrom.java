package com.ApnaCollegeProblems.Functions;

public class q3Ispalindrom {
    public static boolean isPalindrom(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;// move left pointer
            j--; // move right pointer left
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPalindrom("awej"));     // false
        System.out.println(isPalindrom("Racecar"));  // false (case-sensitive)
        System.out.println(isPalindrom("racecar"));  // true
    }
}
