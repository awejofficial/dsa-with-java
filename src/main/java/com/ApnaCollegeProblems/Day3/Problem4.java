package com.ApnaCollegeProblems.Day3;

import javax.naming.spi.DirStateFactory;

public class Problem4 {
    public static void main(String args[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.12f;
        double d = 99.9954;

        double result = (f*b)+(i%c)-(d*s);
        System.out.println("Result: "+result);

    }
}
