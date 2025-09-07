package com.ApnaCollegeProblems.Array;
public class Trapped_Rainwater {
    public static int TrapedWater (int height[]) {
        //calculate the left max boundry- array
        int h = height.length;
        int leftMax = new int[h];
        leftMax[0] = height[0];
        for(int i=1; i<h;i++) {
            leftMax[i] = Math.max(height[i],leftMax[i]);
        }

        //calculate the right max boundry - array
        int rightMax = new int[h];
        rightMax[h-1] = height[h-1];
        for(int i=n-2; i<=0; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1])
        } 
        //loop
        int trappedWater =0;
        for(int i=0 ; i<h; i++) {
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
        //waterlevel= min(leftmaxBoundry,rightmaxBundry)
        //trapped water = waterlevel - height[i]


    }
    public static void main(String args []) {
        int height[] ={4,2,0,6,3,2,5};

    }
    
}
