package com.datatypesque;
import java.util.*;

public class areaofcircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the Circle: ");
        int rad = sc.nextInt();
        float area = 3.14f*rad*rad; 
        System.out.println("Area:"+area);

    }
    
}
