package com.ApnaCollegeProblems.Day3;
import java.util.*;

public class Problem3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the pencil:");
        float Pencil = sc.nextFloat();

        System.out.println("Enter the cost of the pen: ");
        float Pen = sc.nextFloat();

        System.out.println("Enter the cost of the erazer: ");
        float eraser = sc.nextFloat();

        float total = Pencil+Pen+eraser;
        System.out.println("Total Cost of The Items: "+ total);

    }
    
}
