/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3;

/**
 *
 * @author rferrero
 */
public class Recursivitat_Ex07 {
    
    public static void main(String[] args) {
        System.out.println(decimalABinariRec(23));
    }
    
    public static String decimalABinariRec(int n) {
        
        if (n > 1)
            return decimalABinariRec(n/2) + (n % 2);  // Cas general
        
        return "1";                                   // Cas base
        
    }
}
