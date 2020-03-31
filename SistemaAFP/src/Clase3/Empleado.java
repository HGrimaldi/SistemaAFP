/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3;

import Clase4.Trabajador;

/**
 *
 * @author Herberth
 */
public class Empleado extends Trabajador {
    private double Sueldo;
    private double Impuestos;
    
    private final int Pago = 15;
    
    //En esta parte del codigo se ejecuta el metodo constructor 
    public Empleado (String nombre, String SSS, double Sueldo){
        
        super(nombre,SSS);
        
        this.Sueldo = Sueldo;
        this.Impuestos = 0.3*Sueldo;            
    }
    
    //Nomina
    public double CalcularPago(){
        
        return (Sueldo-Impuestos)/Pago;      
    }
    //toString
    public String toString(){
        
        return "Empleado"+super.toString();
        
    }  
    private void Super(String Nombre, String SSS) {
        
    }
}
