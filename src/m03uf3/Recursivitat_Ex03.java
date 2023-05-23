package m03uf3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rferrero
 */
public class Recursivitat_Ex03 {
    
    public static void main(String[] args) {
        
        System.out.println("Potencia(7^0) = " + potenciaRec(7,0));
    }    
    
    public static int potenciaRec(int m,int n) {
        
        if (n > 1)
            return m*potenciaRec(m,n-1);    // cas general
        
        else if (n == 0)
            return 1;
        
        return m;                           // cas base
        
    }
}
