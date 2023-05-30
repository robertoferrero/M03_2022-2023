/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3.pa;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import m03uf3.Contacte;

/**
 *
 * @author rferrero
 */
public class GesioVehicles {
    
    public static void main(String[] args) {
        
        
        try {
            FileReader flux = new FileReader("vehicles.csv");            
            BufferedReader fitxerCSV = new BufferedReader(flux);
            
            FileOutputStream fitxerSer = new FileOutputStream("vehicles.ser");
            ObjectOutputStream desti = new ObjectOutputStream(fitxerSer);
            
            
            String liniaFitxer = null;            
            while ((liniaFitxer = fitxerCSV.readLine()) != null) {
                String[] dades = liniaFitxer.split(";");
                Vehicle v = new Vehicle(dades[0],Integer.parseInt(dades[1]),
                                        Integer.parseInt(dades[2]),
                                        Integer.parseInt(dades[3]));
                desti.writeObject(v);                
            }
            
            desti.close();
            
            // Deserialització 
            FileInputStream fitxer = new FileInputStream("vehicles.ser");
            ObjectInputStream origen = new ObjectInputStream(fitxer);
            
            System.out.println("*** Dades dels vehicles ** ");
            Vehicle v = null;
            while ( (v = (Vehicle)origen.readObject()) != null ) {
                System.out.println(v);
                System.out.println("");
            }
            
        } catch(IOException e) {}
          catch (ClassNotFoundException e2) {}
        
    }
}
