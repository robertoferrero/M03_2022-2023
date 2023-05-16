/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class LlegirFitxerText {
    
    public static void main(String[] args) {
        
    
    String nom, cognoms, telefon, adreca;
    try{ 
        FileReader flux = new FileReader("Agenda.txt");
          // Crea l’arxiu si no existeix i sobreescriu el contingut
          // Utilitzar FileWriter(“Agenda.txt”, true) per fer “append”
        BufferedReader fitxer = new BufferedReader(flux);        
        ArrayList<Contacte> agenda = new ArrayList<Contacte>();
        String liniaSencera;
        while( (liniaSencera = fitxer.readLine()) != null ) {                     
            String[] linia = liniaSencera.split(";");
            Contacte persona = new Contacte(linia[0],linia[1],linia[2],linia[3]);
            agenda.add(persona);
        } 
        fitxer.close();
        Collections.sort(agenda);
        mostrarAgenda(agenda);

    }catch(IOException e){System.out.println("Error al fitxer");}        
    }
    
    
    public static void mostrarAgenda(ArrayList<Contacte> agenda) {
        
        System.out.println("*** AGENDA ***");
        for (Contacte c : agenda) {
            System.out.println("Nom    : " + c.getNom());
            System.out.println("Cognoms: " + c.getCognoms());
            System.out.println("Telèfon: " + c.getTelefon());
            System.out.println("Adreça : " + c.getAdreca());
            System.out.println("");    
        }
                
    }
}
