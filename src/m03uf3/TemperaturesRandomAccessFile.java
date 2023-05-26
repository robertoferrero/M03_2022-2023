/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author rferrero
 */
public class TemperaturesRandomAccessFile {
    
    public static void main(String[] args) {
        
        byte[] temperatures = {1,2,3};
        byte[] mestemperatures = {4,5,6,7};
        
        try {
            
            escriureTemperatures(temperatures);
            escriureTemperatures(mestemperatures,3);
            
            byte[] temp = new byte[10];
            llegirTemperatures(temp);
            for (byte t : temp) {
                System.out.println("Temperatura: " + t);
            }
            
            
            
        } catch (IOException e) { 
            System.out.println("S'ha produit un error.");
            System.out.println(e.getMessage()); 
        }
        
    }
    
    public static void escriureTemperatures(byte[] temperatures) throws IOException {

        RandomAccessFile fitxer = 
        new RandomAccessFile("temperatures_random","rw");

        fitxer.write(temperatures);
        fitxer.close();
    }
        
    
    public static void escriureTemperatures(byte[] temperatures,                                             
                                            int pos) throws IOException {
        RandomAccessFile fitxer = 
        new RandomAccessFile("temperatures_random","rw");

        fitxer.seek(pos);
        fitxer.write(temperatures);
        fitxer.close();
        
    }

    public static void llegirTemperatures(byte[] temperatures) throws IOException {                

        RandomAccessFile fitxer = 
        new RandomAccessFile("temperatures_random","r");
        
        fitxer.read(temperatures);
        fitxer.close();
        
    }

}
