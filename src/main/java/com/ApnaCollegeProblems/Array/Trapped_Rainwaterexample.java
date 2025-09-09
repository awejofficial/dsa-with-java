package com.ApnaCollegeProblems.Array;

public class Trapped_Rainwaterexample {
    public static int Trapped_Rainwater (int height[]) {
        int h = height.length;

        // left
        int leftMax[] = new int[h];
        leftMax[0] = height[0];
        for (int i =1; i<h; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

         // right
         int rightMax[] = new int[h];
         rightMax[h-1] = height[h-1];
         for (int i =h-2; i>=0; i--) {
             rightMax[i] = Math.max(height[i], rightMax[i+1]);
         }

         //Loop
         int trappedWater =0;
         for (int i=0;i<h;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
         }
         return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total Trapped Water: " + Trapped_Rainwater(height));
    }
}
