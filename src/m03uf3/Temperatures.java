/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author rferrero
 */
public class Temperatures {
    
    
    public static void main(String[] args) {
        
        
        byte[] temperatures = new byte[3];
        temperatures[0] = 14;
        temperatures[1] = 16;
        temperatures[2] = 17;
        
        //salvarTemperatures(temperatures);
        byte[] temp = llegirTemperatures();
        System.out.println("");
    }
    
    public static void salvarTemperatures(byte[] temperatures) {
        
        try {
            FileOutputStream fitxer = new FileOutputStream("temperatures");
            
            for (byte temperatura : temperatures) {
                fitxer.write(temperatura);
            }
            fitxer.close();
        } catch (IOException e) {}
        
    }
    
    public static byte[] llegirTemperatures() {

        byte[] contingut = null;
        try {
            FileInputStream fitxer = new FileInputStream("temperatures");

            /*fitxer.skip(1);
            int valor = fitxer.read();
            System.out.println("Valor 1: " + valor);
            valor = fitxer.read();
            System.out.println("Valor 2: " + valor);
            valor = fitxer.read();
            System.out.println("Valor 3: " + valor);*/

            contingut = fitxer.readAllBytes();
            fitxer.close();
        } catch (IOException e) {}  
        
        return contingut;
    }
    
    
}
