package com.ApnaCollegeProblems.Functions;


public class factorial {
    public static int fact(){
        int f=1;
        int n;
        for (int i=1;i<=n; i++){
            f=f*i;
         
        }
        return f;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of a The is :"+fact());

    }
    
}
