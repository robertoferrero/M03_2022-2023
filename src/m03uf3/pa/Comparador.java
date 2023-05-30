/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3.pa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Comparador {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        
        String fitxer1 = demanaFitxerEntrada(1);
        String fitxer2 = demanaFitxerEntrada(2);
        
        System.out.print("Nom del fitxer sortida: ");
        String nomFitxerSortida = sc.nextLine();        
        File fitxerSortida = new File(nomFitxerSortida);
        if (fitxerSortida.exists())
            System.out.println("El fitxer existeix i es sobreescriurà!");
        
        try {
            FileReader flux1 = new FileReader(fitxer1);
            FileReader flux2 = new FileReader(fitxer2);
            BufferedReader f1 = new BufferedReader(flux1);
            BufferedReader f2 = new BufferedReader(flux2);
            
            FileWriter flux3 = new FileWriter(nomFitxerSortida);
            BufferedWriter out = new BufferedWriter(flux3);
            
            String liniaFitxer1 = null, liniaFitxer2 = null;
            int comptador = 1;
            while ((liniaFitxer1 = f1.readLine()) != null && (liniaFitxer2 = f2.readLine()) != null) {
                if (liniaFitxer1.equals(liniaFitxer2))
                    out.write(liniaFitxer1 + "\n");
                else {
                    System.out.println("Línia " + comptador + " diferent:");
                    System.out.println(fitxer1 + ": " + liniaFitxer1);
                    System.out.println(fitxer2 + ": " + liniaFitxer2);
                }
                comptador++;
            }
            
            if (liniaFitxer1 == null && liniaFitxer2 == null)
                System.out.println("Final dels dos fitxers en línia " + (comptador-1));
            else if (liniaFitxer1 == null) {
                System.out.println("Final del fitxer " + fitxer1 + " en línia " + (comptador-1));
                System.out.println("Resta del fitxer " + fitxer2 + ": ");
                //System.out.println(liniaFitxer2);
                while ((liniaFitxer2 = f2.readLine()) != null) {            
                    System.out.println(liniaFitxer2);
                    comptador++;
                }
                System.out.println("Final de fitxer " + fitxer2 + " en línia " + (comptador-1));
            } else {
                System.out.println("Final del fitxer " + fitxer2 + " en línia " + (comptador-1));
                System.out.println("Resta del fitxer " + fitxer1 + ": ");
                System.out.println(liniaFitxer1);
                while ((liniaFitxer1 = f1.readLine()) != null) {            
                    System.out.println(liniaFitxer1);
                    comptador++;
                }
                System.out.println("Final de fitxer " + fitxer1 + " en línia " + (comptador-1));
            }
            
            out.close();
            
        } catch (IOException e) {}
    }
    
    public static String demanaFitxerEntrada(int n) {

        String nomFitxer = null;
        while (true) {
            System.out.print("Nom del fitxer d’entrada " + n + ": ");
            nomFitxer = sc.nextLine();
            File fitxer = new File(nomFitxer);
            if (!fitxer.exists())
                System.out.println("Aquest fitxer no existeix!");
            else
                break;
        }

        return nomFitxer;
    }
}
