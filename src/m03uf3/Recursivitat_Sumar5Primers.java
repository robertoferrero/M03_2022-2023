/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3;

/**
 *
 * @author rferrero
 */
public class Recursivitat_Sumar5Primers {
    
    public static void main(String[] args) {
        
        /*
        // Solució iterativa
        int suma = 0;
        for (int i = 5;i>0;--i)
            suma += i;
        */
        int suma = sumaRec(5);
        System.out.println("Suma = " + suma);
        
        int factorial = factorialRec(5);
        System.out.println("Factorial = " + factorial);
    }
    
    // Solució recursiva
    public static int sumaRec(int n) {
        if (n > 1)
            return n + sumaRec(n-1);  // algorisme general
        else
            return 1;                 // Cas bàsic n = 1
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
        
        return 1;                        // Cas bàsic
    }
}
