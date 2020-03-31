/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Clase3.Empleado;
import Clase2.Consultor;
import Clase4.Trabajador;
import java.util.Scanner;

/**
 *
 * @author Herberth
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        
        boolean salir = false;

        //En esta parte del codigo declararemos las variables
        Trabajador trabajador;
        Empleado empleado;
        Consultor consultor;

        //En esta parte del codigo declararemos los objetos
        trabajador = new Trabajador("Gabriela", "123");

        empleado = new Empleado("Ernesto", "456", 25000.0);

        consultor = new Consultor("Gabriela", "123", 17, 50.0);

       
 
        

        //En esta parte del codigo se emplea la salida estandar del toString
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println(trabajador);

        System.out.println(empleado);
        
        System.out.println(consultor);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

    }

}
