package com.ApnaCollegeProblems.Array;

public class Trapped_Rainwaterexample {
    publid static int (int height[]) {
        int h = height.length;

        // left
        int leftMax[] = new int[h];
        leftMax[0] = height[0];
        for (int i =1; i<h; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

         // right
         int rightMax[] = new int[h];
         rightMax[-1] = height[-1];
         for (int i =h-2; i>=h; i--) {
             rightMax[i] = Math.max(height[i], leftMax[i-1]);
         }
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
    }
}
