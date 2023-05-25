/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Fitxers_Ex03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueixi el nom del fitxer:");
        String nomFitxer = sc.nextLine();
        
        File fitxer = new File(nomFitxer);
        System.out.println("Nom: " + fitxer.getName());
        System.out.println("Ruta: " + fitxer.getPath());
        
        if(fitxer.exists())
            System.out.println("El fitxer existeix");
        else
            System.out.println("El fitxer NO existeix");
        
        if (fitxer.canRead())
            System.out.println("Es pot llegir");
        else
            System.out.println("NO es pot llegir");
        
        if (fitxer.canWrite())
            System.out.println("Es pot modificar");
        else
            System.out.println("Es NO pot modificar");
        
        System.out.println("La longitud és: " + fitxer.length() + " bytes");
        
        
    }
}
