/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;


/**
 *
 * @author rferrero
 */
public class DescarregarFitxer {
    
    public static void main(String[] args) {
        
        String url = "https://mancofi.dk/wp-content/uploads/2018/01/pexels-photo-768932.jpeg";
        
        try {
            BufferedInputStream inputFile = new BufferedInputStream(new URL(url).openStream());
            byte[] bufferDatos = new byte[1024];
            int bytesLlegits = 0;
            FileOutputStream fitxerSortida = new FileOutputStream("imatge.jpg");
            while ( (bytesLlegits = inputFile.read(bufferDatos, 0, 1024)) != -1) {
                fitxerSortida.write(bufferDatos,0,bytesLlegits);
            }
        } catch (IOException e) {}
    }
}
