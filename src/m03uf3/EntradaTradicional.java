/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author rferrero
 */
public class EntradaTradicional {
    
    public static void main(String[] args) {
        InputStreamReader flux = new InputStreamReader(System.in);
   	BufferedReader teclat = new BufferedReader(flux );
   
   	System.out.println("Soc l'ECO");
	String text;
   	try{
            OutputStreamWriter fluxSortida = new OutputStreamWriter(System.out);
            BufferedWriter pantalla = new BufferedWriter(fluxSortida);            
            while(!(text = teclat.readLine()).equals("")){
                    //System.out.println(text);
                    pantalla.write(text + "\n");
            }
            pantalla.flush();
   	}catch(IOException e){
       	System.out.println("Error en llegir de l'entrada estàndar");
   	}
        
    }
}
