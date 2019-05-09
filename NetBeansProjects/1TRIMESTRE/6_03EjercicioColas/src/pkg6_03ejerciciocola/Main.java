/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_03ejerciciocola;

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
        Colas cola = new Colas();
        /**
         * Ejercicio 6.02
         */
        System.out.println("Colas\n=====\n");
        
        System.out.println(cola.estaVacia());
        cola.ponerCola(50);
        cola.ponerCola("Objeto1");
        cola.ponerCola(40);
        
        System.out.println(cola.estaVacia());
                
        System.out.println(cola.verCima());
        cola.quitarCola();
        System.out.println(cola.verCima());
    }
    
}
