package com.ApnaCollegeProblems.PatternPt2;

// This class is responsible for printing a half-inverted number pyramid pattern.
public class Half_Inverted_Number_Pyramid {
 // This function prints the half-inverted number pyramid.
 // It takes an integer 'n' which determines the number of rows.
    public static void InvHalfPyraNo (int n) {
 // Outer loop for the number of rows.
        for(int i =1; i<=n; i++){
 // Inner loop for printing the numbers in each row.
 // The number of elements decreases in each subsequent row.
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
                
            }
 // Move to the next line after printing each row.
            System.out.println();
        }
        
    }
 
    public static void main(String args[]){
 // Call the function to print the pyramid with 6 rows.
        InvHalfPyraNo(6);
        

    }
    
}
