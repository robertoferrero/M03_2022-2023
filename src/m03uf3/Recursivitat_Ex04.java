/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3;

/**
 *
 * @author rferrero
 */
public class Recursivitat_Ex04 {
    
    public static void main(String[] args) {
        
        int n = 5;
        System.out.println("Fibonacci(" + n + ") = " + fibonacciRec(n));
    }
    
    public static int fibonacciRec(int n) {
        
        if (n > 1)
            return fibonacciRec(n-1) + fibonacciRec(n-2);   // Cas general
        
        return 1;                                           // cas base
        
    }
}
