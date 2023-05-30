/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03uf3.pa;

import java.io.Serializable;
/**
 *
 * @author rferrero
 */
public class Vehicle implements Serializable {
    
    private String matricula;
    private int anyFabricacio;
    private int quilometratge;
    private int potencia;

    public Vehicle(String matricula,int any,int km, int potencia) {
        this.matricula = matricula;
        this.anyFabricacio = any;
        this.quilometratge = km;
        this.potencia = potencia;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnyFabricacio() {
        return anyFabricacio;
    }

    public void setAnyFabricacio(int anyFabricacio) {
        this.anyFabricacio = anyFabricacio;
    }

    public int getQuilometratge() {
        return quilometratge;
    }

    public void setQuilometratge(int quilometratge) {
        this.quilometratge = quilometratge;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public String toString() {
        return ("Matrícula: " + matricula + "\n" +
                "Any fabricació: " + anyFabricacio + "\n" +
                "Quilometratge: " + quilometratge + " km\n" +
                "Potència: " + potencia + " CV");
    }
    
}
