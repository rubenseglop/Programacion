/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_02ejerciciopilas;

/**
 *
 * @author Ruben
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        /**
         * Ejercicio 6.02
         */
        Pila pila = new Pila();
        System.out.println("\nPilas\n======\n");
        
        System.out.println(pila.estaVacia());
        pila.ponerPila(50);
        pila.ponerPila("Objeto1");
        pila.ponerPila(40);
        
        System.out.println(pila.estaVacia());
                
        System.out.println(pila.verCima());
        pila.quitarPila();
        System.out.println(pila.verCima());
    }
}
