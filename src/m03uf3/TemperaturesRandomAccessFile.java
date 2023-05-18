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
        
        byte[] temperatures = {20,21,22};
        
        try {
            RandomAccessFile fitxer = 
                    new RandomAccessFile("temperatures_random","rw");
            
            //escriureTemperatures(temperatures,fitxer);
            
            byte[] temp = new byte[10];
            llegirTemperatures(temp,fitxer);
            for (byte t : temp) {
                System.out.println("Temperatura: " + t);
            }
            
            
        } catch (IOException e) { System.out.println(e.getMessage()); }
        
    }
    
    public static void escriureTemperatures(byte[] temperatures, 
                                            RandomAccessFile f) throws IOException {
        
        f.write(temperatures);
        f.close();
    }

    public static void llegirTemperatures(byte[] temperatures,RandomAccessFile f) throws IOException {                
        f.read(temperatures);
        f.close();
    }

}
