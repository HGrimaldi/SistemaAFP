/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

import Clase4.Trabajador;

/**
 *
 * @author Herberth
 */
public class Consultor extends Trabajador  {
    private int Horas;
    private double Tarifa;
    
    
    
   //En esta parte del codigo se declara el Metodo constructor 
    
    public Consultor (String nombre, String SSS, int Horas, double Tarifa){
        
          super(nombre,SSS);
          
          this.Horas = Horas;
          this.Tarifa= Tarifa;               
    }
      //En esta parte del codigo esta el pago por horas
    
    public double CalcularPago(){
        return Horas*Tarifa;
        
    }
    //toString
    public String toString(){
        
        return "Consultor"+super.toString();
        
                
    }
            
            
    
    private void Super(String Nombre, String SSS) {
        
    }
}
