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
        Lista lista = new Lista();
        Pila pila = new Pila();
        
        System.out.println("\nPilas\n======\n");
        
        System.out.println(pila.vacia());
        pila.pop(50);
        pila.pop("Objeto1");
        pila.pop(40);
        
        System.out.println(pila.vacia());
                
        System.out.println(pila.verCima());
    }
}
