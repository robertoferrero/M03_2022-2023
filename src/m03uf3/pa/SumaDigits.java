/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3.pa;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class SumaDigits {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre enter: ");
        int n = sc.nextInt();
        
        System.out.println("La suma dels dígits és: " + sumaDigitsRec(n));
        
    }
    
    public static int sumaDigitsRec(int n) {
        
        if (n > 10)
            return (n % 10) + sumaDigitsRec(n/10);
        
        return n;
    }
    
}
