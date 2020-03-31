/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4;

import java.util.Date;

/**
 *
 * @author Herberth
 */
public class Trabajador {
    
    private String nombre;
    private String Puesto;
    private String Direccion;
    private String Telefono;
    private Date FechaNacimiento;
    private Date FechaContrato;
    private String SSS;
    
    //Metodo Constructor
    public Trabajador (String nombre, String SSS){
     
       
        this.nombre= nombre;
        this.SSS= SSS;
        
    }
    
    
    
    //En esta parte del codigo se declaran los metodos gat & set.
    
    
    
    //En esta parte del codigo esta la comparacion de objetos
    
    public boolean equals (Trabajador t){
        
       return this.SSS.equals(t.SSS);
            
    }
   
//En esta parte esta la conversion de caracteres
       
    @Override
       public String toString(){
           
      return nombre + "NSS" +SSS;
       
       }     
     }

