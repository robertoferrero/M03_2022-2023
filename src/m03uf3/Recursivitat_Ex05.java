package m03uf3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rferrero
 */
public class Recursivitat_Ex05 {

    public static void main(String[] args) {
        
        int n = 0;
        System.out.println("sumaParells(" + n + ") = " + sumaParellsRec(n));
    }
    
    public static int sumaParellsRec(int n) {
        
        
        if (n%2 != 0)                                  // senar
            n = n - 1;
                
        if (n > 2)
            return n + sumaParellsRec(n-2);       // Cas general n parell
        
        if (n == 0)
            return 0;
        
        return 2;                                   // cas base n parell
    }
    
}
