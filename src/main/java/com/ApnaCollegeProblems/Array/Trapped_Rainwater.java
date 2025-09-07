package com.ApnaCollegeProblems.Array;

public class Trapped_Rainwater {
    public static int TrapedWater(int height[]) {
        int h = height.length;

        int leftMax[] = new int[h];
        leftMax[0] = height[0];
        for (int i = 1; i < h; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[h];
        rightMax[h - 1] = height[h - 1];
        for (int i = h - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < h; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterlevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total Trapped Water: " + TrapedWater(height));
    }
}
