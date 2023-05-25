/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3;

/**
 *
 * @author rferrero
 */
public class Recursivitat_Ex06 {
    
    public static void main(String[] args) {
        
        System.out.println(sumandsDoblesRec(3,6));
        
    }
    
    public static int sumandsDoblesRec(int n, int m) {
        
        if (m > 1)
            return n*m + sumandsDoblesRec(n,m-1);   // Cas general
        
        return n;                                   // Cas base
    }
}
