/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncoches;
import dominio.vehiculo;

/**
 *
 * @author Alumnos Mañana
 */
public class GestionCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("GESTIÓN COCHES");
        
         vehiculo coche1 = new vehiculo("12345t");
         System.out.println(" "+coche1);
    }

}
