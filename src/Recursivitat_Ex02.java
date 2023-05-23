/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rferrero
 */
public class Recursivitat_Ex02 {
    public static void main(String[] args) {
        
        int factorial = factorialRec(5);
        System.out.println("Factorial = " + factorial);        
    }

    public static int factorialIter(int n) {
        int factorial = 1;
        for(int i = n; i>1; --i)
            factorial *= i;
        
        return factorial;
        
    }

    public static int factorialRec(int n) {
        
        if (n > 1)
            return n*factorialRec(n-1);      // Cas general
        
        return 1;                            // Cas bàsic
    }
    
}
